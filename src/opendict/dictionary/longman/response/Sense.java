package opendict.dictionary.longman.response;

/**
 * Created by baoke on 21/12/2016.
 */
public class Sense implements opendict.common.Sense {
    public CollocationExample[] collocation_examples;
    public String[] definition;
    public Example[] examples;
    public GramaticalExample[] gramatical_examples;
    public GramaticalInfo gramatical_info;
    public String opposite;
    public String signpost;

    @Override
    public String[] getDefinitions() {
        return definition;
    }

    @Override
    public opendict.common.Example[] getExamples() {
        return examples;
    }

    @Override
    public opendict.common.Sense[] getSubSenses() {
        return null;
    }
}
