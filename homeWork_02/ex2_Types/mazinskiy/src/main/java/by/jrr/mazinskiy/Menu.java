package by.jrr.mazinskiy;

import java.util.Scanner;

public class Menu {
    Menu(){
        System.out.println("Write integer numbers ");

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();

        Sum res = new Sum();
        Multiplayer multiplayer = new Multiplayer();

        System.out.printf("Sum: %d \n", res.Applay(a,b));
        System.out.printf("Multiplication: %d \n", multiplayer.Multiplication(a,b));


    }


}
