package opendict;

import opendict.dictionary.longman.LongmanDictionary;
import opendict.dictionary.oxford.OxfordDictionary;

public class Main {

    public static void main(String[] args) {
        Shelf shelf = new Shelf();

        /*
          Replace apiKey with your own.
          Get apiKey on http://developer.pearson.com/apis/dictionaries
         */
        shelf.addDictionary("longman", new LongmanDictionary("apiKey"));
        /*
         * Replace app_id and app_key with your own.
         * Get app_id and app_key on https://developer.oxforddictionaries.com
         */
        shelf.addDictionary("oxford", new OxfordDictionary("app_id", "app_key"));

        new Interpreter(shelf).run();
    }
}
