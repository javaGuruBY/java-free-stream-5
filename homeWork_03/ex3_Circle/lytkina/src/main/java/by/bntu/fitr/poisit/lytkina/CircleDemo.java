package by.bntu.fitr.poisit.lytkina;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the radius");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("Area of that circle is " + circle.calculateArea(radius));
    }
}
