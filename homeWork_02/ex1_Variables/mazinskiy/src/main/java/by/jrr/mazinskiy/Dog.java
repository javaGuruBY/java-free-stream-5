package by.jrr.mazinskiy;

public class Dog extends HomeAnimal {
    private String name;
    private int age;
    private String color;

    Dog(String name, int age, String color){
        super(name,age,color);
    }
    public void voice(){
        System.out.println("Wooof");
    }
    public void eat(){
        System.out.println("om nom");
    }
    public void sleep(){
        System.out.println("hrrrr");
    }


}
