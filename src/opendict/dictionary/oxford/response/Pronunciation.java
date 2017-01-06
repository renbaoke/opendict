package opendict.dictionary.oxford.response;

import opendict.common.Audio;

/**
 * Created by baoke on 22/12/2016.
 */
public class Pronunciation implements opendict.common.Pronunciation {
    public String audioFile;
    //public String[] regions;
    public String[] dialects;
    //public String phoneticsNotation;
    public String phoneticNotation;
    //public String phoneticsSpelling;
    public String phoneticSpelling;

    @Override
    public String getIPA() {
        return phoneticSpelling;
    }

    @Override
    public Audio getAudio() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof opendict.common.Pronunciation))
            return false;

        return getIPA() == null
                ? ((opendict.common.Pronunciation) obj).getIPA() == null
                : getIPA().equals(((opendict.common.Pronunciation) obj).getIPA());
    }

    @Override
    public int hashCode() {
        return getIPA().hashCode();
    }
}
