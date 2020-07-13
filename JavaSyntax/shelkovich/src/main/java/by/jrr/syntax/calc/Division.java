package by.jrr.syntax.calc;

public class Division {

    private int a;
    private int b;

    public Division(int a, int b) {
        System.out.println("double initializated");
        this.a = a;
        this.b = b;
    }

    public double calculate() {
        double result = 0.0;
        if(b < 0) {
            System.out.println("I don't want calculate negative");
            System.out.println("Operation not supported, default 0.0 has been returned");
        } else if (b > 10) {
            System.out.println("It's a good value to calculate !");
            System.out.println("Operation not supported, default 0.0 has been returned");
        } else if (b != 0) {
            result = a / (double) b;
            System.out.println("(a / b) = " + (a / b));
        } else {
            System.out.println("Illegal argument");
            System.out.println("Operation not supported, default 0.0 has been returned");
        }
        return result;
    }
}
