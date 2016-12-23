package opendict.oxford.response;

import opendict.common.AbstractMeaning;

/**
 * Created by baoke on 22/12/2016.
 */
public class Response extends AbstractMeaning {
    private Metadata metadata;
    private Result[] results;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Result[] getResults() {
        return results;
    }

    public void setResults(Result[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "oxford dictionary response";
    }
}
