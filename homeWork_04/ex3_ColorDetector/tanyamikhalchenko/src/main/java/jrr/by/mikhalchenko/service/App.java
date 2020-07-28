package jrr.by.mikhalchenko.service;

import jrr.by.mikhalchenko.bean.LightColorDetector;

public class App {
    public static void main(String[] args) {
       LightColorDetectorService lightColorDetectorService = new LightColorDetectorService();
       LightColorDetector lightColorDetector = new LightColorDetector(10);
       String result;
       result = lightColorDetectorService.detect(lightColorDetector);
       System.out.println(result);
    }
}
