package jrr.by.mikhalchenko.service;

import jrr.by.mikhalchenko.bean.LightColorDetector;
import org.junit.Test;

import static org.junit.Assert.*;

public class LightColorDetectorServiceTest {

    @Test
    public void detectTheVioletСolor() {
        LightColorDetector lightColorDetector = new LightColorDetector(380);
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        if (lightColorDetector.getWavelength() > 379 && lightColorDetector.getWavelength() < 450) {
            String expected = "Violet";
            String actual = lightColorDetectorService.detect(lightColorDetector);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void detectTheBlueСolor() {
        LightColorDetector lightColorDetector = new LightColorDetector(494);
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        if (lightColorDetector.getWavelength() > 449 && lightColorDetector.getWavelength() < 495) {
            String expected = "Blue";
            String actual = lightColorDetectorService.detect(lightColorDetector);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void detectTheGreenСolor() {
        LightColorDetector lightColorDetector = new LightColorDetector(500);
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        if (lightColorDetector.getWavelength() > 494 && lightColorDetector.getWavelength() < 570) {
            String expected = "Green";
            String actual = lightColorDetectorService.detect(lightColorDetector);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void detectTheYellowСolor() {
        LightColorDetector lightColorDetector = new LightColorDetector(589);
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        if (lightColorDetector.getWavelength() > 569 && lightColorDetector.getWavelength() < 590) {
            String expected = "Yellow";
            String actual = lightColorDetectorService.detect(lightColorDetector);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void detectTheOrangeСolor() {
        LightColorDetector lightColorDetector = new LightColorDetector(600);
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        if (lightColorDetector.getWavelength() > 589 && lightColorDetector.getWavelength() < 620) {
            String expected = "Orange";
            String actual = lightColorDetectorService.detect(lightColorDetector);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void detectTheRedСolor() {
        LightColorDetector lightColorDetector = new LightColorDetector(622);
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        if (lightColorDetector.getWavelength() > 619 && lightColorDetector.getWavelength() < 751) {
            String expected = "Red";
            String actual = lightColorDetectorService.detect(lightColorDetector);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void detectTheInvisibleLightСolor() {
        LightColorDetector lightColorDetector = new LightColorDetector(751);
        LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();

        if (lightColorDetector.getWavelength() < 380 && lightColorDetector.getWavelength() > 750) {
            String expected = "Invisible Light";
            String actual = lightColorDetectorService.detect(lightColorDetector);
            assertEquals(expected, actual);
        }
    }
}








