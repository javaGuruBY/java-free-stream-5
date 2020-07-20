package by.jrr.maistrenko;

import java.util.ArrayList;

public class MathOperationsOnList {

    public static double addAllItems(ArrayList<Double> list) {
        double result = 0;

        for (double item : list) {
            result += item;
        }

        return result;
    }
}
