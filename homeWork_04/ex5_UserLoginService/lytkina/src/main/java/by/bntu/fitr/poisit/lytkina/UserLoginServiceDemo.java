package by.bntu.fitr.poisit.lytkina;

import java.util.Scanner;

public class UserLoginServiceDemo {
    public static void main(String[] args) {
        User user = new User("Olya", "1234", false, 3);
        

        System.out.println("Hello unknown!");

        UserLoginService userLoginService = new UserLoginService();


        for (int count = user.loginAttempt-1; count >=0 ; count--) {
            System.out.println("Enter your password");
            Scanner scanner = new Scanner(System.in);
            String password = scanner.nextLine();
            if (userLoginService.login(user, password)) {
                System.out.println("Hello, " + user.login + "\nWelcome!!!");
                break;
            } else {
                System.out.println("Wrong password. You have " + count + " attempt(s).");
            }
        }
        if (user.isBlocked){
            System.out.println("You are blocked! Goodbye !!!");
        }
    }
}
