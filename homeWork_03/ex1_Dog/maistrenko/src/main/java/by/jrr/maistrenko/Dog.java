package by.jrr.maistrenko;

public class Dog {
    private int age;
    private String color;
    private String name;

    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    void voice() {
        System.out.println("Barks.");
    }

    void eat() {
        System.out.println("Is eating.");
    }

    void sleep() {
        System.out.println("Is sleeping.");
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "by.jrr.maistrenko.Dog{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
