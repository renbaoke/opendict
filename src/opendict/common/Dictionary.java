package opendict.common;

import opendict.exception.DictionaryNotAvailableException;

/**
 * A dictionary can be used to look up a word.
 * Created by baoke on 22/12/2016.
 */
public interface Dictionary {
    /**
     * Look up a word.
     * @param word the word to be looked up
     * @return the meaning of the word
     * @throws DictionaryNotAvailableException
     * If this dictionary is not available.
     */
    Meaning lookup(String word) throws DictionaryNotAvailableException;
}
