package opendict.common;

/**
 * The purpose of this class is to generate general human-readable meaning.
 * Created by baoke on 22/12/2016.
 */
public abstract class AbstractMeaning implements Meaning {
    /**
     * Subclasses rewrite this method to generate more specific human-readable meaning.
     * TODO : not yet finished
     * @return human-readable meaning
     */
    @Override
    public String toString() {
        return "abstract meaning";
    }
}
