package opendict;

import opendict.common.Dictionary;
import opendict.exception.DictionaryNotAvailableException;
import opendict.exception.DictionaryNotFoundException;

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
            System.out.println(e.getMessage());
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
        String usage = "available command :\n" +
                "\tlist dictionaries\n" +
                "\tlookup <word> in <dictionary>\n" +
                "\t\thint : replace \" \" in word with \"-\"\n" +
                "\thelp\n" +
                "\texit\n";

        System.out.print(usage);
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
                usage();
                break;
            case "exit":
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
