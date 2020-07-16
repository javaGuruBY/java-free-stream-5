package by.jrr.mazinskiy;


public class Cat extends HomeAnimal {
    private String name;
    private int age;
    private String color;

    Cat(String name, int age, String color) {
        super(name, age, color);
    }

    public void voice() {
        System.out.println("meooow");
    }

    public void eat() {
        System.out.println("mewmewmew");
    }

    public void sleep() {
        System.out.println("mmmmmmmmmmmmrrrrrrrrrrrrr");
    }
}

