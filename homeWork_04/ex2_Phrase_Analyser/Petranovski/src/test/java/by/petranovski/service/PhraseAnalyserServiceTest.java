package by.petranovski.service;

import static org.junit.Assert.*;

public class PhraseAnalyserServiceTest {

    @org.junit.Test
    public void analyseTrueTest() {
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();
        String text = "Make app great again";
        String expected = "It stands no chance";
        String actual = phraseAnalyserService.analyse(text);
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void analyseTrue1Test() {
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();
        String text = "Make app beautiful again";
        String expected = "It could be worse";
        String actual = phraseAnalyserService.analyse(text);
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void analysefalseTest() {
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();
        String text = "Do app beautiful again";
        String expected = "It is fine, really";
        String actual = phraseAnalyserService.analyse(text);
        assertEquals(expected, actual);
    }
}