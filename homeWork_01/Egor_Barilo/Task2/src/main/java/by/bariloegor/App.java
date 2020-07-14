package by.bariloegor;

import by.bariloegor.threads.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            try {
                Thread thread;
                System.out.println("\nWhat to do?\n" +
                        "1.Feed cat\n" +
                        "2.Make coffee\n" +
                        "3.Morning workout\n" +
                        "4.Shopping\n" +
                        "5.Morning wake up");
                Integer userInput = Integer.valueOf(scanner.nextLine());
                switch (userInput) {
                    case 1:
                        thread = new FeedCat();
                        thread.run();
                        break;
                    case 2:
                        thread = new MakeCoffee();
                        thread.run();
                        break;
                    case 3:
                        thread = new MorningWorkout();
                        thread.run();
                        break;
                    case 4:
                        thread = new Shopping();
                        thread.run();
                        break;
                    case 5:
                        thread = new WakeUp();
                        thread.run();
                        break;
                }
            } catch (Exception ex){
                System.out.println("Error." + ex);
            }
        }
    }
}
