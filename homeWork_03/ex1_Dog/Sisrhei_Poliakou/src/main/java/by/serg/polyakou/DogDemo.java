package by.serg.polyakou;

public class DogDemo {

    public static void main(String[] args) {

        Dog shepherd = new Dog(4, "black", "Miki");
        Dog poodle = new Dog(2, "white", "Pona");
        Dog pikiness = new Dog(7, "brown", "Riki");


        shepherd.info();
        shepherd.eat();
        shepherd.sleep();
        shepherd.voice();

        System.out.println();

        poodle.info();
        poodle.voice();
        poodle.sleep();
        poodle.eat();

        System.out.println();

        pikiness.info();
        pikiness.eat();
        pikiness.sleep();
        pikiness.voice();

    }

}
