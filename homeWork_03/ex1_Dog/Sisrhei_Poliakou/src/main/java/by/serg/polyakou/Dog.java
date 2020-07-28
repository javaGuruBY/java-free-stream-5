package by.serg.polyakou;

public class Dog {

   public int age;
   public String color;
   public String name;

   public Dog (int age, String color, String name ) {
       this.age = age;
       this.color = color;
       this. name = name;
   }

    public void voice (){
       System.out.println("The dog barks - hau, hau");
   }
    public void eat (){
        System.out.println("The dog eat meat");
    }
    public void sleep (){
        System.out.println("The dog sleep");
    }

    public void info () {
        System.out.println("The dog is name: " + this.name +", color: " + this.color + ", age: " +this.age);
    }

}
