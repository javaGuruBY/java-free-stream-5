package jrr.by.mikhalchenko;

public class Dog {

    public int age;
    public String color;
    public String name;
    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void voice() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Woof - woof - woof!");
        }
    }

    public void  eat() {
        for (int i = 1; i < 4; i++) {
            System.out.println("Mute - mute - mute!");
        }
    }

    public void sleep(){
        for (int i = 1; i < 4; i++) {
            System.out.println("Zzz... Zzz...Zzz.");
        }
    }
    public void printInformationAboutDog() {
        System.out.println("The dog name is  " + this.name + ".");
        System.out.println("Dog color " + this.color + ".");
        System.out.println("The dog's age is " + this.age + " years.");
    }
}

