package by.jrr.maistrenko;

import java.util.ArrayList;

public class RandomGeneratorDemo {

    public static void demonstrateList(ArrayList<Double> listForDemonstration) {
        for (double item : listForDemonstration) {
            System.out.print(item + ", ");
        }
        System.out.println();
    }

    public static void demonstrateResult(String operation, double result) {
        System.out.println(operation + ": " + result);
    }
}
