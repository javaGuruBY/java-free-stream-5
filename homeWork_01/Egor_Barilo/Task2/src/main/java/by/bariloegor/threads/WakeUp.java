package by.bariloegor.threads;

public class WakeUp extends Thread{
    @Override
    public void run(){
        System.out.println("Wake up.");
        System.out.println("1.open eyes\n" +
                "2.reach out\n" +
                "3.to sit down\n" +
                "4.think about life\n" +
                "5.push back the blanket\n" +
                "6.get out of bed");
    }
}
