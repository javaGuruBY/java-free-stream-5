package by.jrr.Ruslan_sto_HW3_Ex1_Dog;

public class Dog {
    public int age;
    public String color;
    public String name;

     public Dog(int age, String color, String name) {
         this.age =age;
         this.color =color;
         this.name =name;
    }
       public void dogInfo (){
           System.out.println("Dog's name is "+this.name);
           System.out.println(this.name+" is "+this.age+" yeas old");
           System.out.println(this.name+" is "+this.color);
    }
public boolean bark;

    public void voice() {
        this.bark=true;
    }
    public void noVoice() {
        this.bark=false;
    }
    public boolean eatMeat;

    public void eat() {
        this.eatMeat=true;
    }public void noEat() {
        this.eatMeat=false;
    }
    public boolean itSleep;

    public void sleep() {
        this.itSleep=true;
    }public void noSleep() {
        this.itSleep=false;
    }
}
