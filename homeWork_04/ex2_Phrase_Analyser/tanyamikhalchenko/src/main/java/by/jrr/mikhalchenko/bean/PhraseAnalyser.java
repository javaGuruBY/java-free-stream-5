package by.jrr.mikhalchenko.bean;

public class PhraseAnalyser {
    private String firstWord;
    private String lastWords;

    public PhraseAnalyser() {
    }

    public PhraseAnalyser(String firstWord, String lastWords) {
        this.firstWord = firstWord;
        this.lastWords = lastWords;
    }

    public String getFirstWord() {
        return firstWord;
    }

    public String getLastWords() {
        return lastWords;
    }
}
