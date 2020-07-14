package by.bariloegor.threads;

public class MorningWorkout extends Thread{
    @Override
    public void run(){
        System.out.println("Morning workout.");
        System.out.println("1.stretch your arms\n" +
                "2.stretch your legs\n" +
                "3.stretch your torso\n" +
                "4.do squats\n" +
                "5.do push ups");
    }
}
