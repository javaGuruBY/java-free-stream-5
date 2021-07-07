package by.jrr.Ruslan_sto_HW3_Ex3_Circle;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle= new Circle();
        circle.radius=5;
        double S1 =circle.calculateArea();
        System.out.println("Area of the circle = "+S1+" , when radius is "+circle.radius);
        System.out.println();
        circle.radius=1;
        double S2 =circle.calculateArea();
        System.out.println("Area of the circle = "+S2+" , when radius is "+circle.radius);
        System.out.println();
        }

    }

