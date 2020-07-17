package by.bntu.fitr.poisit.lytkina;

public class PhraseAnalyserDemo {
    public static void main(String[] args) {


        String text = "Make Hello great again make";
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        String actual = phraseAnalyser.analyze(text);
        String expected1 = "It stands no chance";
        String expected2 = "It could be worse";
        String expected3 = "It is fine, really";

        PhraseAnalyserDemo phraseAnalyserDemo = new PhraseAnalyserDemo();
        phraseAnalyserDemo.testing(actual, expected1);
        phraseAnalyserDemo.testing(actual, expected2);
        phraseAnalyserDemo.testing(actual, expected3);
    }

    public void testing(String actual, String expected){

        PhraseAnalyserTest phraseAnalyserTest = new PhraseAnalyserTest();
        phraseAnalyserTest.checkThatEqual(expected, actual);

    }
}
