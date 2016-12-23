package opendict.exception;

/**
 * Trying to get a dictionary by non-existent name will throws this exception,
 * that is, no dictionary mapped to the name.
 * Created by baoke on 22/12/2016.
 */
public class DictionaryNotFoundException extends Exception {
    /*
     * Dictionary name, or "any" if there is no even one dictionary.
     */
    private String name;

    public DictionaryNotFoundException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return name + " dictionary not found";
    }
}
