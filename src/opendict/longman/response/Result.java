package opendict.longman.response;

/**
 * Created by baoke on 21/12/2016.
 */
public class Result {
    private String[] datasets;
    private String headword;
    private int homnum;
    private String id;
    private String part_of_speech;
    private Pronunciation[] pronunciations;
    private Sense[] senses;
    private String url;

    public String[] getDatasets() {
        return datasets;
    }

    public void setDatasets(String[] datasets) {
        this.datasets = datasets;
    }

    public String getHeadword() {
        return headword;
    }

    public void setHeadword(String headword) {
        this.headword = headword;
    }

    public int getHomnum() {
        return homnum;
    }

    public void setHomnum(int homnum) {
        this.homnum = homnum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPart_of_speech() {
        return part_of_speech;
    }

    public void setPart_of_speech(String part_of_speech) {
        this.part_of_speech = part_of_speech;
    }

    public Pronunciation[] getPronunciations() {
        return pronunciations;
    }

    public void setPronunciations(Pronunciation[] pronunciations) {
        this.pronunciations = pronunciations;
    }

    public Sense[] getSenses() {
        return senses;
    }

    public void setSenses(Sense[] senses) {
        this.senses = senses;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
