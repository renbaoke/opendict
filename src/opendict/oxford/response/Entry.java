package opendict.oxford.response;

/**
 * Created by baoke on 22/12/2016.
 */
public class Entry {
    private String[] etymologies;
    private GrammaticalFeature[] grammaticalFeatures;
    private String homographNumber;
    private Sense[] senses;
    private VariantForm[] variantForms;

    public String[] getEtymologies() {
        return etymologies;
    }

    public void setEtymologies(String[] etymologies) {
        this.etymologies = etymologies;
    }

    public GrammaticalFeature[] getGrammaticalFeatures() {
        return grammaticalFeatures;
    }

    public void setGrammaticalFeatures(GrammaticalFeature[] grammaticalFeatures) {
        this.grammaticalFeatures = grammaticalFeatures;
    }

    public String getHomographNumber() {
        return homographNumber;
    }

    public void setHomographNumber(String homographNumber) {
        this.homographNumber = homographNumber;
    }

    public Sense[] getSenses() {
        return senses;
    }

    public void setSenses(Sense[] senses) {
        this.senses = senses;
    }

    public VariantForm[] getVariantForms() {
        return variantForms;
    }

    public void setVariantForms(VariantForm[] variantForms) {
        this.variantForms = variantForms;
    }
}
