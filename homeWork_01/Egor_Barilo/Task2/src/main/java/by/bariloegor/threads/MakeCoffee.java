package by.bariloegor.threads;

public class MakeCoffee extends Thread{
    @Override
    public void run(){
        System.out.println("Make coffee");
        System.out.println("1.take a cup\n" +
                "2.pour coffee\n" +
                "3.pour sugar\n" +
                "4.stir coffee\n" +
                "5.drink");

    }
}
