package opendict.dictionary.oxford.response;

import opendict.common.AbstractMeaning;

/**
 * Created by baoke on 22/12/2016.
 */
public class Response extends AbstractMeaning {
    public Metadata metadata;
    public Result[] results;

    @Override
    public Result[] getResults() {
        return results;
    }
}
