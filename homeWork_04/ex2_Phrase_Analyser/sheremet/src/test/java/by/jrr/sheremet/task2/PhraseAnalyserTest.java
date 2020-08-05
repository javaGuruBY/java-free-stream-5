package by.jrr.sheremet.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhraseAnalyserTest {

    @Test
    public void analyzeShouldReturnStringWithNoChance() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        String phrase = "Make app great again";
        String expected = "It stands no chance";
        String actual = phraseAnalyser.analyze(phrase);
        assertEquals(expected, actual);
    }

    @Test
    public void analyzeShouldReturnStringWithWorth() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        String phrase = "Make app great again f";
        String expected = "It could be worse";
        String actual = phraseAnalyser.analyze(phrase);
        assertEquals(expected, actual);
    }

    @Test
    public void analyzeShouldReturnStringWithFine() {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        String phrase = "App great again make";
        String expected = "It is fine, really";
        String actual = phraseAnalyser.analyze(phrase);
        assertEquals(expected, actual);
    }
}