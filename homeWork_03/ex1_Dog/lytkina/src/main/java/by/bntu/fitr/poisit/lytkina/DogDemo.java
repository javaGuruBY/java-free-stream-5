package by.bntu.fitr.poisit.lytkina;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        dog.name = "Tuzic";
        dog.age = 5;
        dog.color = "black";
        
        System.out.println("Dog`s name is " + dog.name + ". He is " + dog.age + " years old. Color is " + dog.color + ".");
        
        dog.voice();
        dog.eat();
        dog.sleep();
    }
}
