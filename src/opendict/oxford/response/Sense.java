package opendict.oxford.response;

/**
 * Created by baoke on 22/12/2016.
 */
public class Sense {
    private String[] definitions;
    private Example[] examples;
    private String id;
    private String[] regions;
    private String[] registers;
    private Sense[] subsenses;

    public String[] getDefinitions() {
        return definitions;
    }

    public void setDefinitions(String[] definitions) {
        this.definitions = definitions;
    }

    public Example[] getExamples() {
        return examples;
    }

    public void setExamples(Example[] examples) {
        this.examples = examples;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getRegions() {
        return regions;
    }

    public void setRegions(String[] regions) {
        this.regions = regions;
    }

    public String[] getRegisters() {
        return registers;
    }

    public void setRegisters(String[] registers) {
        this.registers = registers;
    }

    public Sense[] getSubsenses() {
        return subsenses;
    }

    public void setSubsenses(Sense[] subsenses) {
        this.subsenses = subsenses;
    }
}
