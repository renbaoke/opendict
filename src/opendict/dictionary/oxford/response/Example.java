package opendict.dictionary.oxford.response;

import opendict.common.Audio;

/**
 * Created by baoke on 22/12/2016.
 */
public class Example implements opendict.common.Example {
    public String text;

    @Override
    public String getText() {
        return text;
    }

    @Override
    public Audio getAudio() {
        return null;
    }
}
