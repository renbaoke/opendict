package opendict.dictionary.longman.response;

/**
 * Created by baoke on 21/12/2016.
 */
public class Pronunciation implements opendict.common.Pronunciation {
    public Audio[] audio;
    public String ipa;
    public String lang;

    @Override
    public opendict.common.Audio getAudio() {
        if (audio == null)
            return null;
        else
            return audio[0];
    }

    @Override
    public String getIPA() {
        return ipa;
    }
}
