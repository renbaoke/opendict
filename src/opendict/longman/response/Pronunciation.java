package opendict.longman.response;

/**
 * Created by baoke on 21/12/2016.
 */
public class Pronunciation {
    private Audio[] audio;
    private String ipa;
    private String lang;

    public Audio[] getAudio() {
        return audio;
    }

    public void setAudio(Audio[] audio) {
        this.audio = audio;
    }

    public String getIpa() {
        return ipa;
    }

    public void setIpa(String ipa) {
        this.ipa = ipa;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
