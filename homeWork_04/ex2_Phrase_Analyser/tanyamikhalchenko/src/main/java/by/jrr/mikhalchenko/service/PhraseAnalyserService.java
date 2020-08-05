package by.jrr.mikhalchenko.service;

import by.jrr.mikhalchenko.bean.PhraseAnalyser;


public class PhraseAnalyserService {

    public String analyzeASentence(PhraseAnalyser phraseAnalyser) {
        String firstStandardWord = "Make";
        String lastStandardWord = "great again";
        String theSentenceIsUnchanged = "It stands no chance";
        String theSentenceWithOneChange = "It could be worse";
        String theSentenceIsChanged = "It is fine, really";
        if (phraseAnalyser.getFirstWord() == firstStandardWord && phraseAnalyser.getLastWords() == lastStandardWord) {
            return theSentenceIsUnchanged;
        } else if (phraseAnalyser.getFirstWord() == firstStandardWord && phraseAnalyser.getLastWords() != lastStandardWord || phraseAnalyser.getFirstWord() != firstStandardWord && phraseAnalyser.getLastWords() == lastStandardWord) {
            return theSentenceWithOneChange;
        } else {
            return theSentenceIsChanged;
        }
    }
}





