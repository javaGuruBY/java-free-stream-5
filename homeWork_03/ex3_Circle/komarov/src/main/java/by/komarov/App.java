package by.komarov;

import by.komarov.bean.Circle;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle();
        
        circle.radius = 20.0;
        double s = circle.calculateArea();
        double expected = 628;
        System.out.println("Circle  radius =" + circle.radius + "(s == expected) = " + (s == expected));

        circle.radius = 40.0;
        s = circle.calculateArea();
        expected = 125.6;
        System.out.println("Circle  radius =" + circle.radius + "(s == expected) = " + (s == expected));
    }


}
