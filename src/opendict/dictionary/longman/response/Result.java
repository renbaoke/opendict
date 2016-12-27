package opendict.dictionary.longman.response;

/**
 * Created by baoke on 21/12/2016.
 */
public class Result implements opendict.common.Result {
    public String[] datasets;
    public String headword;
    public int homnum;
    public String id;
    public String part_of_speech;
    public Pronunciation[] pronunciations;
    public Sense[] senses;
    public String url;

    @Override
    public String getHeadword() {
        return headword;
    }

    @Override
    public String getPOS() {
        return part_of_speech;
    }

    @Override
    public opendict.common.Pronunciation[] getPronunciations() {
        return pronunciations;
    }

    @Override
    public opendict.common.Sense[] getSenses() {
        return senses;
    }
}
