package by.bntu.fitr.poisit.lytkina;

public class Human {
    public String name;
    public int age;

    public Human(){

    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet(String name, int age){
        System.out.println("Hi, my name is " + name + ". I'm " + age + " years old.");
    }
}