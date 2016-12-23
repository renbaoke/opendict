package opendict.oxford.response;

/**
 * Created by baoke on 22/12/2016.
 */
public class Result {
    private String id;
    private String language;
    private LexicalEntry[] lexicalEntries;
    private String type;
    private String word;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public LexicalEntry[] getLexicalEntries() {
        return lexicalEntries;
    }

    public void setLexicalEntries(LexicalEntry[] lexicalEntries) {
        this.lexicalEntries = lexicalEntries;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
