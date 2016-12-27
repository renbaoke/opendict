package opendict.common;

/**
 * The purpose of this class is to generate general human-readable meaning.
 * Created by baoke on 22/12/2016.
 */
public abstract class AbstractMeaning implements Meaning {
    /**
     * Subclasses rewrite this method to generate more specific human-readable meaning.
     * TODO : not yet finished
     *
     * @return human-readable meaning
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Result result : getResults()) {
            String headword = result.getHeadword();
            if (headword == null)
                return "";

            builder.append(headword).append(" ");

            if (result.getPronunciations() != null)
                for (Pronunciation pronunciation : result.getPronunciations())
                    builder.append("/").append(pronunciation.getIPA()).append("/ ");

            String pos = result.getPOS();
            if (pos != null)
                builder.append("[").append(pos).append("]");

            builder.append("\n");

            Sense[] senses = result.getSenses();
            if (senses != null)
                for (Sense sense : senses) {
                    if (sense.getDefinitions() != null)
                        for (String definition : sense.getDefinitions())
                            builder.append("-").append(definition).append("\n");

                    if (sense.getExamples() != null)
                        for (Example example : sense.getExamples())
                            builder.append(" ").append(example.getText()).append("\n");

                    Sense[] subsenses = sense.getSubSenses();
                    if (subsenses != null) {
                        for (Sense subsense : subsenses) {
                            if (subsense.getDefinitions() != null)
                                for (String definition : subsense.getDefinitions())
                                    builder.append(" -").append(definition).append("\n");

                            if (subsense.getExamples() != null)
                                for (Example example : subsense.getExamples())
                                    builder.append("  ").append(example.getText()).append("\n");
                        }
                    }
                }
                builder.append("\n");
        }
        return builder.toString();
    }
}
