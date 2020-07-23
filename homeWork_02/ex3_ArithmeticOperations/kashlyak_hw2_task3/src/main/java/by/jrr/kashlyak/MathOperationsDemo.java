package by.jrr.kashlyak;

import java.util.Scanner;

public class MathOperationsDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Addition");
        double a = scan.nextDouble();
        double b = scan.nextDouble();

        Addition addition = new Addition(a , b);
        double result = addition.calculate();
        System.out.println(result);

        System.out.println("\nDevision");
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        Devision devision = new Devision(c, d);
        double result2 = devision.calculate();
        System.out.println(result2);

        System.out.println("\nMultiplication");
        double e = scan.nextDouble();
        double f = scan.nextDouble();
        Miltiplicate miltiplicate = new Miltiplicate(e, f);
        double result3 = miltiplicate.calculate();
        System.out.println(result3);

        System.out.println("\nRemainder");
        double g = scan.nextDouble();
        double h = scan.nextDouble();
        Remainder remainder = new Remainder(g, h);
        double result4 = remainder.calculate();
        System.out.println(result4);

        System.out.println("\nSubstraction");
        double i = scan.nextDouble();
        double j = scan.nextDouble();
        Substraction substraction = new Substraction(i, j);
        double result5 = substraction.calculate();
        System.out.println(result5);



    }


}
