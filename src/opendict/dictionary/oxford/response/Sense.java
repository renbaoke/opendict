package opendict.dictionary.oxford.response;

/**
 * Created by baoke on 22/12/2016.
 */
public class Sense implements opendict.common.Sense {
    public String[] definitions;
    public Example[] examples;
    public String id;
    public String[] regions;
    public String[] registers;
    public Sense[] subsenses;

    @Override
    public String[] getDefinitions() {
        return definitions;
    }

    @Override
    public opendict.common.Example[] getExamples() {
        return examples;
    }

    @Override
    public opendict.common.Sense[] getSubSenses() {
        return subsenses;
    }
}
