package by.jrr.maistrenko;

public class MathOperations {
    public static final String ADDITION = "Addition";
    public static final String SUBSTRUCTION = "Substruction";
    public static final String MULTIPLICATION = "Multiplication";
    public static final String DIVISION = "Division";

    public static void main(String[] args) {

        double a = 5.1;
        double b = 6.3;

        MathOperationsDemo.demonstrate(ADDITION, MathOperator.add(a, b));
        MathOperationsDemo.demonstrate(SUBSTRUCTION, MathOperator.substractBFromA(a, b));
        MathOperationsDemo.demonstrate(MULTIPLICATION, MathOperator.multiplicate(a, b));
        MathOperationsDemo.demonstrate(DIVISION, MathOperator.divideAbyB(a, b));
    }
}
