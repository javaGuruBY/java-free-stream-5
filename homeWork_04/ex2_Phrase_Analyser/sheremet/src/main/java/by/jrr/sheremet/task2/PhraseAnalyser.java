package by.jrr.sheremet.task2;

public class PhraseAnalyser {


    public String analyze(String phrase) {
        final String MAKE = "Make";
        final String GREAT_AGAIN = "great again";
        boolean hasTwoOptions = phrase.startsWith(MAKE) && phrase.endsWith(GREAT_AGAIN);
        boolean hasOneOptionAtLeast = phrase.startsWith(MAKE) || phrase.endsWith(GREAT_AGAIN);

        if (hasTwoOptions) {
            return "It stands no chance";
        } else if (hasOneOptionAtLeast) {
            return "It could be worse";
        }
        return "It is fine, really";
    }
}
