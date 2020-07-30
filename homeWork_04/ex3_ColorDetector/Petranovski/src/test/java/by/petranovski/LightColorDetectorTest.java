package by.petranovski;

import static org.junit.Assert.*;

public class LightColorDetectorTest {

    @org.junit.Test
    public void detectVioletTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 381;
        String expected = "Violet";
        String actual = lightColorDetector.detect(wavelength);
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void detectBlueTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 470;
        String expected = "Blue";
        String actual = lightColorDetector.detect(wavelength);
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void detectGreenTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 501;
        String expected = "Green";
        String actual = lightColorDetector.detect(wavelength);
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void detectYellowTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 580;
        String expected = "Yellow";
        String actual = lightColorDetector.detect(wavelength);
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void detectOrangeTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 591;
        String expected = "Orange";
        String actual = lightColorDetector.detect(wavelength);
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void detectRedTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 630;
        String expected = "Red";
        String actual = lightColorDetector.detect(wavelength);
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void detectAnotherTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int wavelength = 370;
        String expected = "Invisible Light";
        String actual = lightColorDetector.detect(wavelength);
        assertEquals(expected, actual);
    }
}