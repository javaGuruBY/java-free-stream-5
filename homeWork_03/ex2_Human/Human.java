package by.jrr.petranovski_Human;

public class Human {
    String name;
    int age;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void greet() {
        System.out.println("Hi! My name is " + name + ", I'm " + age + " years old");
    }
}

