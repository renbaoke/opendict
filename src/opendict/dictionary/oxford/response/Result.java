package opendict.dictionary.oxford.response;

import opendict.common.*;
import opendict.common.Pronunciation;
import opendict.common.Sense;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by baoke on 22/12/2016.
 */
public class Result implements opendict.common.Result {
    public String id;
    public String language;
    public LexicalEntry[] lexicalEntries;
    public String type;
    public String word;

    @Override
    public String getHeadword() {
        return id;
    }

    @Override
    public String getPOS() {
        return lexicalEntries[0].lexicalCategory;
    }

    @Override
    public Pronunciation[] getPronunciations() {
        HashSet<Pronunciation> pronunciations = new HashSet<>();
        if (lexicalEntries != null)
            for (LexicalEntry lexicalEntry : lexicalEntries)
                if (lexicalEntry.pronunciations != null)
                    for (Pronunciation pronunciation : lexicalEntry.pronunciations)
                        pronunciations.add(pronunciation);

        Pronunciation[] ret = new Pronunciation[pronunciations.size()];
        pronunciations.toArray(ret);

        return ret;
    }

    @Override
    public Sense[] getSenses() {
        LinkedList<Sense> senses = new LinkedList<>();
        if (lexicalEntries != null)
            for (LexicalEntry lexicalEntry : lexicalEntries)
                if (lexicalEntry.entries != null)
                    for (Entry entry : lexicalEntry.entries)
                        if (entry.senses != null)
                            for (Sense sense : entry.senses)
                                senses.push(sense);

        Sense[] ret = new Sense[senses.size()];
        senses.toArray(ret);

        return ret;
    }
}
