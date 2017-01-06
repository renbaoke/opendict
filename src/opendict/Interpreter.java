package opendict;

import opendict.common.Dictionary;
import opendict.exception.DictionaryNotAvailableException;
import opendict.exception.DictionaryNotFoundException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * The purpose of this class is to interact to user, read and execute command.
 * Created by baoke on 22/12/2016.
 */
class Interpreter {
    private Scanner scanner = new Scanner(System.in);
    private Shelf shelf;

    Interpreter(Shelf shelf) {
        this.shelf = shelf;
    }

    private void lookup(StringTokenizer tokenizer) {
        if (!tokenizer.hasMoreTokens())
            return;

        String word = tokenizer.nextToken().replace("-", " ");

        Dictionary dictionary;
        try {
            if (tokenizer.hasMoreTokens() && "in".equals(tokenizer.nextToken()) && tokenizer.hasMoreTokens())
                dictionary = shelf.getDictionary(tokenizer.nextToken());
            else
                dictionary = shelf.getDefaultDictionary();

        } catch (DictionaryNotFoundException e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            System.out.println(dictionary.lookup(word).toString());
        } catch (DictionaryNotAvailableException e) {
            System.out.println("*" + e.getMessage() + "*");
        } catch (NullPointerException e) {
            System.out.println("*failed to parse json string*");
        }
    }

    private void list(StringTokenizer tokenizer) {
        if (!tokenizer.hasMoreTokens())
            return;

        switch (tokenizer.nextToken()) {
            case "dictionaries":
                for (String name : shelf.getDictionaryNames())
                    System.out.println(name);
                break;
            default:

        }
    }

    private void usage() {
        FileReader reader;
        String filename = "usage.txt";
        char[] buffer = new char[1024*1024];
        int length;

        try {
            reader = new FileReader(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("*" + e.getMessage() + "*");
            return;
        }

        try {
            length = reader.read(buffer);
        } catch (IOException e) {
            System.out.println("*" + e.getMessage() + "*");
            return;
        }

        System.out.print(new String(buffer, 0, length));
    }

    private void parse(String command) {
        StringTokenizer tokenizer = new StringTokenizer(command, " ");

        if (!tokenizer.hasMoreTokens())
            return;

        switch (tokenizer.nextToken()) {
            case "lookup":
                lookup(tokenizer);
                break;
            case "list":
                list(tokenizer);
                break;
            case "help":
            case "usage":
                usage();
                break;
            case "exit":
            case "quit":
                System.exit(0);
            default:

        }
    }

    @SuppressWarnings("InfiniteLoopStatement")
    void run() {
        while (true) {
            System.out.print("opendict >");
            parse(scanner.nextLine());
        }
    }
}
