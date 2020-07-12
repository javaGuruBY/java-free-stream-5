package by.bariloegor.threads;

public class Shopping extends Thread{
    @Override
    public void run(){
        System.out.println("Shopping");
        System.out.println("1.come to the store\n" +
                "2.take a basket\n" +
                "3.pick up products\n" +
                "4.put food near the checkout\n" +
                "5.pay for products\n" +
                "6.leave the store");
    }
}
