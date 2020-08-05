package by.jrr.mikhalchenko.service;

import by.jrr.mikhalchenko.bean.PhraseAnalyser;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhraseAnalyserServiceTest {

    @Test
    public void analyzeASentenceFirstVariant() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser("Make", "great again");
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();

        if (phraseAnalyser.getFirstWord() == "Make" && phraseAnalyser.getLastWords() == "great again") {
            String expected = "It stands no chance";
            String actual = phraseAnalyserService.analyzeASentence(phraseAnalyser);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testAnalyzeASentenceSecondVariant() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser("Make", "better place");
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();

        if (phraseAnalyser.getFirstWord() == "Make" && phraseAnalyser.getLastWords() != "great again") {
            String expected = "It could be worse";
            String actual = phraseAnalyserService.analyzeASentence(phraseAnalyser);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void analyzeASentence() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser("Don't make", "great again");
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();

        if (phraseAnalyser.getFirstWord() != "Make" && phraseAnalyser.getLastWords() == "great again") {
            String expected = "It could be worse";
            String actual = phraseAnalyserService.analyzeASentence(phraseAnalyser);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testAnalyzeASentence() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser("I look forward to", "lesson");
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();

        if (phraseAnalyser.getFirstWord() != "Make" && phraseAnalyser.getLastWords() != "great again") {
            String expected = "It is fine, really";
            String actual = phraseAnalyserService.analyzeASentence(phraseAnalyser);
            assertEquals(expected, actual);
        }
    }
}








