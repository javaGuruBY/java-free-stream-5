package by.bariloegor.threads;

public class FeedCat extends Thread{
    @Override
    public void run(){
        System.out.println("Feed cat");
        System.out.println("1.come to the kitchen\n" +
                "2.take a bowl\n" +
                "3.pour food into a bowl\n" +
                "4.call a cat\n" +
                "5.put a bowl\n" +
                "6.pet the cat");
    }
}
