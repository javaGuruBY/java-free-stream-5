package by.jrr.maistrenko;

import java.util.ArrayList;

public class RandomGeneratorApp {

    public static final String ADDITION = "Addition";

    public static void main(String[] args) {

        int amountOfNumbers = 3;

        ArrayList<Double> listOFRandomNumbers = new ArrayList<>();

        for (int i = 0; i < amountOfNumbers; i++) {
            listOFRandomNumbers.add(Math.random());
        }

        RandomGeneratorDemo.demonstrateList(listOFRandomNumbers);
        RandomGeneratorDemo.demonstrateResult(ADDITION, MathOperationsOnList.addAllItems(listOFRandomNumbers));

    }
}
