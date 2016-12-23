package opendict;

import opendict.common.Dictionary;
import opendict.exception.DictionaryNotFoundException;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * A shelf used to store dictionaries.
 * Created by baoke on 22/12/2016.
 */
class Shelf {
    private Map<String, Dictionary> dictionaries = new HashMap<>();

    List<String> getDictionaryNames() {
        return new LinkedList<>(dictionaries.keySet());
    }

    Dictionary getDefaultDictionary() throws DictionaryNotFoundException {
        if (dictionaries.size() == 0)
            throw new DictionaryNotFoundException("any");
        return dictionaries.values().iterator().next();
    }

    Dictionary getDictionary(String name) throws DictionaryNotFoundException {
        Dictionary dictionary = dictionaries.get(name);
        if (dictionary == null)
            throw new DictionaryNotFoundException(name);
        return dictionary;
    }

    void addDictionary(String name, Dictionary dictionary) {
        dictionaries.put(name, dictionary);
    }
}
