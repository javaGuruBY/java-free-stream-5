package by.jrr.mazinskiy;

public abstract class HomeAnimal {
    private String name;
    private int age;
    private String color;

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getColor() { return color; }

    public HomeAnimal(String name, int age, String color){

        this.name=name;
        this.age=age;
        this.color=color;
    }


    public abstract void voice();
    public abstract void eat();
    public abstract void sleep();

}
