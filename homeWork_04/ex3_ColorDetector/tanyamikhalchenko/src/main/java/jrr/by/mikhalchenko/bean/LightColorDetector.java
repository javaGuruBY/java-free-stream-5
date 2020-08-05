package jrr.by.mikhalchenko.bean;

public class LightColorDetector {
    private int wavelength;

    public LightColorDetector() {

    }
    public LightColorDetector(int wavelength) {
        this.wavelength = wavelength;
    }

    public int getWavelength() {
        return wavelength;
    }

    public void setWavelength(int wavelength) {
        this.wavelength = wavelength;
    }
}
