package by.jrr.mazinskiy;

public class App {
    public static void main(String[] args) {
       HomeAnimal animalOne = new Cat("krisa",32, "blue");
       HomeAnimal animalTwo = new Dog("Boris",32, "red");
        animalOne.eat();
        animalOne.voice();
        animalTwo.voice();
        animalTwo.sleep();


    }

}
