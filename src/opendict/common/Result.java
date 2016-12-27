package opendict.common;

/**
 * Created by baoke on 23/12/2016.
 */
public interface Result {
    String getHeadword();

    /**
     * @return part of speech
     */
    String getPOS();
    Pronunciation[] getPronunciations();
    Sense[] getSenses();
}
