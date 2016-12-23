package opendict.oxford.response;

/**
 * Created by baoke on 22/12/2016.
 */
public class LexicalEntry {
    private Entry[] entries;
    private String language;
    private String lexicalCategory;
    private Pronunciation[] pronunciations;
    private String text;

    public Entry[] getEntries() {
        return entries;
    }

    public void setEntries(Entry[] entries) {
        this.entries = entries;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLexicalCategory() {
        return lexicalCategory;
    }

    public void setLexicalCategory(String lexicalCategory) {
        this.lexicalCategory = lexicalCategory;
    }

    public Pronunciation[] getPronunciations() {
        return pronunciations;
    }

    public void setPronunciations(Pronunciation[] pronunciations) {
        this.pronunciations = pronunciations;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
