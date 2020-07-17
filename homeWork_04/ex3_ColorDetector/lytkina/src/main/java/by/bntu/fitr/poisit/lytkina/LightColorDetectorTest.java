package by.bntu.fitr.poisit.lytkina;

public class LightColorDetectorTest {
    public void checkThatEqual(String expected, String actual){
        if (expected.equals(actual)){
            System.out.println("Test has passed");
        }else{
            System.out.println("Test has failed");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }
}
