package opendict.exception;

/**
 * Invocations on a dictionary not available will throws this exception.
 * Created by baoke on 22/12/2016.
 */
public class DictionaryNotAvailableException extends Exception {
    /*
     * Describe why dictionary is not available.
     */
    private String cause;

    public DictionaryNotAvailableException(String cause) {
        this.cause = cause;
    }

    @Override
    public String getMessage() {
        return "dictionary not available because " + cause;
    }
}
