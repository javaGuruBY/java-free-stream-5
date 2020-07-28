package jrr.by.mikhalchenko.service;

import jrr.by.mikhalchenko.bean.LightColorDetector;

public class LightColorDetectorService {
    public String detect(LightColorDetector lightColorDetector) {
        String monochromaticColorSpectrumViolet = "Violet";//380 ... 449 - Violet
        String monochromaticColorSpectrumBlue = "Blue";//450 ... 494 - Blue
        String monochromaticColorSpectrumGreen = "Green";//495 ... 569 - Green
        String monochromaticColorSpectrumYellow = "Yellow";//570 ... 589 - Yellow
        String monochromaticColorSpectrumOrange = "Orange";//590 ... 619 - Orange
        String monochromaticColorSpectrumRed = "Red";//620 ... 750 - Red
        String monochromaticColorSpectrumInvisibleLight = "Invisible Light";//ВInvisible Light

        if (lightColorDetector.getWavelength() > 379 && lightColorDetector.getWavelength() < 450) {
            return monochromaticColorSpectrumViolet;
        } else if (lightColorDetector.getWavelength() > 449 && lightColorDetector.getWavelength() < 495) {
            return monochromaticColorSpectrumBlue;
        } else if (lightColorDetector.getWavelength() > 494 && lightColorDetector.getWavelength() < 570) {
            return monochromaticColorSpectrumGreen;
        } else if (lightColorDetector.getWavelength() > 569 && lightColorDetector.getWavelength() < 590) {
            return monochromaticColorSpectrumYellow;
        } else if (lightColorDetector.getWavelength() > 589 && lightColorDetector.getWavelength() < 620) {
            return monochromaticColorSpectrumOrange;
        } else if (lightColorDetector.getWavelength() > 619 && lightColorDetector.getWavelength() < 751) {
            return monochromaticColorSpectrumRed;
        } else {
            return monochromaticColorSpectrumInvisibleLight;
        }
    }
}






