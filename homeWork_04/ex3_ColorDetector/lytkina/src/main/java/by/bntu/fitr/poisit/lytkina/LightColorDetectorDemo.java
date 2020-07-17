package by.bntu.fitr.poisit.lytkina;

import java.util.Scanner;

public class LightColorDetectorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of wave");
        int waveLength = scanner.nextInt();

        System.out.println("Input the expected result: ");
        Scanner scanner1 = new Scanner(System.in);
        String expected = scanner1.nextLine();

        LightColorDetector lightColorDetector = new LightColorDetector();
        System.out.println("The color of wave is " + lightColorDetector.detect(waveLength));

        String actual =lightColorDetector.detect(waveLength);
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.checkThatEqual(expected, actual);
    }
}
