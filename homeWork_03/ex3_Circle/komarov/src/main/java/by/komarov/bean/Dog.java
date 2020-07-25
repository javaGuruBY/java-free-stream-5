package by.komarov.bean;

public class Dog {
    public String name;
    public String color;
    public int age;

   

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = 3;
    }
    
    public void voice(){
        for (int i = 1; i < 4; i++ ) {
            System.out.println("Dog say hau hau");
        }
    }
    public void eat(){
        for (int i = 1; i < 2; i++ ) {
            System.out.println("Dog go it to bowl");
        }
    }
    public void sleep(){
        for (int i = 1; i < 2; i++ ) {
            System.out.println("Dog go to home");
        }
    }
    public void printInformationaboutDog() {
        System.out.println("The dog name - " + this.name + ".");
        System.out.println("color " + this.color + ".");
        System.out.println("The dog age " + this.age + " years.");
    }
 
}
