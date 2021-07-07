package by.jrr.Ruslan_sto_HW2_T4;

import java.util.Random;

public class RandomGenerationDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int random_1 = randomGenerator.nextInt(100);
        int random_2 = randomGenerator.nextInt(100);
        int random_3 = randomGenerator.nextInt(100);
        System.out.println("random_1 = " + random_1);
        System.out.println("random_2 = " + random_2);
        System.out.println("random_3 = " + random_3);
        int add = random_1+random_2+random_3;
        System.out.println("Addition of three random generated nambers is");
        System.out.println(random_1+" + "+ random_2+" + "+random_3+" = "+add);
        System.out.println("Result = "+add);
    }
}
