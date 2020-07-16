package by.bntu.fitr.poisit.lytkina;

public class Circle {
    double radius;

    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
}
