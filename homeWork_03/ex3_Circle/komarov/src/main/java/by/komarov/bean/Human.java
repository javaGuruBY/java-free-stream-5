package by.komarov.bean;

public class Human {
    public String name;
    public int age;

   

    public Human(String name, int age) {
        this.name = name;
        this.age = 42;
    }
    
    public void greet(){
        for (int i = 1; i < 2; i++ ) {
            System.out.println("Hello, my name is "+ this.name + ", I,m " + this.age + " years old.");
        }
    }

}
