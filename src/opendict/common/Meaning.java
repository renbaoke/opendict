package opendict.common;

/**
 * A Meaning is something used to explain a word, and generally contains several Results.
 * Created by baoke on 22/12/2016.
 */
public interface Meaning {
    /**
     * Get all Results of this Meaning.
     * @return all Results
     */
    Result[] getResults();
}
