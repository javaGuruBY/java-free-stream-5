package by.jrr.Ruslan_sto_HW3_Ex1_Dog;

public class DogDemo {
    public static void main(String[] args) {

        Dog myDog1 = new Dog(3, "red", "Vers");
        Dog myDog2 = new Dog(2, "spoty", "Hela");
        Dog myDog3 = new Dog(11, "black", "Jocker");


        myDog1.dogInfo();
        myDog1.eat();
        System.out.println("Vers eat meat - " + myDog1.eatMeat);
        System.out.println("Vers is sleeping - "+myDog1.itSleep);
        myDog1.voice();
        myDog1.noVoice();
        System.out.println("Vers's voice=bark - "+myDog1.bark);


        System.out.println();
        myDog2.dogInfo();
        System.out.println("Hela eat meat - " + myDog2.eatMeat);
        myDog2.sleep();
        myDog2.noSleep();
        System.out.println("Hela is sleeping - "+myDog2.itSleep);
        myDog2.voice();
        System.out.println("Hela's voice=bark - "+myDog2.bark);

        System.out.println();
        myDog3.dogInfo();
        myDog3.eat();
        myDog3.noEat();
        System.out.println("Joker eat meat - " + myDog3.eatMeat);
        myDog3.sleep();
        System.out.println("Joker is sleeping - "+myDog3.itSleep);
        System.out.println("Joker's voice=bark - "+myDog3.bark);

        System.out.println();


    }
}
