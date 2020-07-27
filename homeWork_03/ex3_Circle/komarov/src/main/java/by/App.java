package by;

import by.komarov.bean.Dog;


public class App {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik", "Brown", 3   );
        dog.printInformationaboutDog();
        dog.eat();
        dog.sleep();
        dog.voice();

        System.out.println();
    }
}
