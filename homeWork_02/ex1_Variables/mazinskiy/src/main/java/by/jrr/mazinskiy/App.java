package by.jrr.mazinskiy;

public class App {
    public static void main(String[] args) {
       HomeAnimal a = new Cat("krisa",32, "blue");
       HomeAnimal b = new Dog("Boris",32, "red");
       a.eat();
       a.voice();
       b.voice();
       b.sleep();


    }

}
