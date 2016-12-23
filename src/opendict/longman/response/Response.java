package opendict.longman.response;

import opendict.common.AbstractMeaning;

/**
 * Created by baoke on 21/12/2016.
 */
public class Response extends AbstractMeaning {
    private int status;
    private int offset;
    private int limit;
    private int count;
    private int total;
    private String url;
    private Result[] results;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Result[] getResults() {
        return results;
    }

    public void setResults(Result[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "longman dictionary response";
    }
}
