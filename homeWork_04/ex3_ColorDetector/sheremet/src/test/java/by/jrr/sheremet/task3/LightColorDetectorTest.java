package by.jrr.sheremet.task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class LightColorDetectorTest {

    @Test
    public void detectShouldReturnViolet() {
        int waweLight = 381;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expected = "Violet";
        String actual = lightColorDetector.detect(waweLight);
        assertEquals(expected,actual);
    }

    @Test
    public void detectShouldReturnBlue() {
        int waweLight = 451;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expected = "Blue";
        String actual = lightColorDetector.detect(waweLight);
        assertEquals(expected,actual);
    }

    @Test
    public void detectShouldReturnGreen() {
        int waweLight = 496;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expected = "Green";
        String actual = lightColorDetector.detect(waweLight);
        assertEquals(expected,actual);
    }

    @Test
    public void detectShouldReturnYellow() {
        int waweLight = 571;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expected = "Yellow";
        String actual = lightColorDetector.detect(waweLight);
        assertEquals(expected,actual);
    }

    @Test
    public void detectShouldReturnOrange() {
        int waweLight = 591;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expected = "Orange";
        String actual = lightColorDetector.detect(waweLight);
        assertEquals(expected,actual);
    }

    @Test
    public void detectShouldReturnRed() {
        int waweLight = 621;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expected = "Red";
        String actual = lightColorDetector.detect(waweLight);
        assertEquals(expected,actual);
    }

    @Test
    public void detectShouldReturnInvisibleLightLowValue() {
        int waweLight = 379;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expected = "Invisible Light";
        String actual = lightColorDetector.detect(waweLight);
        assertEquals(expected,actual);
    }

    @Test
    public void detectShouldReturnInvisibleLightHighValue() {
        int waweLight = 751;
        LightColorDetector lightColorDetector = new LightColorDetector();
        String expected = "Invisible Light";
        String actual = lightColorDetector.detect(waweLight);
        assertEquals(expected,actual);
    }
}