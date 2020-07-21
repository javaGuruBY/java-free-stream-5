package y.jrr.Petranovski_Dog;

public class Dog {
    int age;
    String color;
    String name;
    public  Dog (int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }
    public void voice() {
        System.out.println("Собака подает голос - гав, гав");
    }
    public void eat() {
        System.out.println("Собак ест");
    }
    public void sleep() {
        System.out.println("Собак спит");
    }

}
