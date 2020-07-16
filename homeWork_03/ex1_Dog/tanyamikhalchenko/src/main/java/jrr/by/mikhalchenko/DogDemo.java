package jrr.by.mikhalchenko;

public class DogDemo {
    public static void main(String[] args) {
        Dog dogFirst = new Dog(2, "black", "Cooper");
        Dog dogSecond = new Dog(3, "brown", "Izzy");
        Dog dogThird = new Dog(5, "white","Bentley");

        dogFirst.printInformationAboutDog();
        dogFirst.voice();
        dogFirst.eat();
        dogFirst.sleep();

        System.out.println();

        dogSecond.printInformationAboutDog();
        dogSecond.voice();
        dogSecond.eat();
        dogSecond.sleep();

        System.out.println();

        dogThird.printInformationAboutDog();
        dogThird.voice();
        dogThird.eat();
        dogThird.sleep();

    }
}
