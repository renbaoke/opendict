package opendict.dictionary.longman.response;

import opendict.common.AbstractMeaning;

/**
 * Created by baoke on 21/12/2016.
 */
public class Response extends AbstractMeaning {
    public int status;
    public int offset;
    public int limit;
    public int count;
    public int total;
    public String url;
    public Result[] results;

    @Override
    public Result[] getResults() {
        return results;
    }

    public void setResults(Result[] results) {
        this.results = results;
    }
}
