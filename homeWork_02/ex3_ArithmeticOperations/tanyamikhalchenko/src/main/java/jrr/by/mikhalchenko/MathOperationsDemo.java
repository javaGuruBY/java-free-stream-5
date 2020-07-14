package jrr.by.mikhalchenko;

public class MathOperationsDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Math Operations'!");
        int a = 999999999;
        int b = 1111111;

        System.out.println("1) Addition '+':");
        System.out.print("a = ");
        System.out.print(a);
        System.out.print(", ");
        System.out.print("b = ");
        System.out.print(b);

        int sum = a + b;

        System.out.println();
        System.out.print("a + b = ");
        System.out.print(a);
        System.out.print(" + ");
        System.out.print(b);
        System.out.print(" = ");
        System.out.print(sum);

        System.out.println();
        System.out.println();
        System.out.println("2) Subtraction '-':");

        long x = 150000000000000L;
        long y = 10000000000000L;

        System.out.println("x = " + x + ", y = " + y);

        long difference = x - y;

        System.out.println("x - y = " + x + " - " + y + " = " + difference);

        System.out.println();
        System.out.println("3) Division '/':");

        short m = 9999;
        short n = 3333;

        System.out.println("m = " + m + ", n = " + n);
        System.out.println("m / n = " + m + " / " + n + " = " + (m / n));

        System.out.println();
        System.out.println("4) Multiplication '*':");

        double c = 999999999999999999999999999999999999999999999.50;
        float d = 99999999999999999999999999999999999999.00F;

        System.out.println("c = " + c + ", d = " + d);
        System.out.println("c * d = " + c + " * " + d + " = " + (c * d));

        System.out.println();
        System.out.println("5) Remainder '%':");

        byte f = 127;
        byte k = 8;

        System.out.println("f = " + f + ", k = " + k);
        System.out.println("f * k = " + f + " % " + k + " = " + (f % k));

    }
}

