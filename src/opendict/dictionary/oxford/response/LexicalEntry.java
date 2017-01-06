package opendict.dictionary.oxford.response;

/**
 * Created by baoke on 22/12/2016.
 */
public class LexicalEntry {
    public Entry[] entries;
    public GrammaticalFeature[] grammaticalFeatures;
    public String[] grammaticalNotes;
    public Inflection[] inflectionOf;
    public Inflection[] inflections;
    public String language;
    public String lexicalCategory;
    public Pronunciation[] pronunciations;
    public String text;
    public VariantForm[] variantForms;
}
