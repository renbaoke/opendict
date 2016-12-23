package opendict.longman.response;

/**
 * Created by baoke on 21/12/2016.
 */
public class Sense {
    private CollocationExample[] collocation_examples;
    private String[] definition;
    private Example[] examples;
    private GramaticalExample[] gramatical_examples;
    private GramaticalInfo gramatical_info;
    private String opposite;
    private String signpost;

    public CollocationExample[] getCollocation_examples() {
        return collocation_examples;
    }

    public void setCollocation_examples(CollocationExample[] collocation_examples) {
        this.collocation_examples = collocation_examples;
    }

    public String[] getDefinition() {
        return definition;
    }

    public void setDefinition(String[] definition) {
        this.definition = definition;
    }

    public Example[] getExamples() {
        return examples;
    }

    public void setExamples(Example[] examples) {
        this.examples = examples;
    }

    public GramaticalExample[] getGramatical_examples() {
        return gramatical_examples;
    }

    public void setGramatical_examples(GramaticalExample[] gramatical_examples) {
        this.gramatical_examples = gramatical_examples;
    }

    public GramaticalInfo getGramatical_info() {
        return gramatical_info;
    }

    public void setGramatical_info(GramaticalInfo gramatical_info) {
        this.gramatical_info = gramatical_info;
    }

    public String getOpposite() {
        return opposite;
    }

    public void setOpposite(String opposite) {
        this.opposite = opposite;
    }

    public String getSignpost() {
        return signpost;
    }

    public void setSignpost(String signpost) {
        this.signpost = signpost;
    }
}
