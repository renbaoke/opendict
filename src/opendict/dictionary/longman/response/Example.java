package opendict.dictionary.longman.response;

/**
 * Created by baoke on 21/12/2016.
 */
public class Example implements opendict.common.Example {
    private Audio[] audio;
    private String text;

    @Override
    public opendict.common.Audio getAudio() {
        if (audio == null)
            return null;
        else
            return audio[0];
    }

    @Override
    public String getText() {
        return text;
    }
}
