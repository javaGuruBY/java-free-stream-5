package jrr.by.mikhalchenko;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int firstUnboundRandom = randomGenerator.nextInt();
        double secondUnboundRandom = randomGenerator.nextInt();
        int thirdBoundRandom = randomGenerator.nextInt(999999999);

        System.out.println("firstUnboundRandom = " + firstUnboundRandom);
        System.out.println("secondUnboundRandom = " + secondUnboundRandom);
        System.out.println("thirdBoundRandom = " + thirdBoundRandom);

        int sumUnboundRandom = firstUnboundRandom + (int) secondUnboundRandom + thirdBoundRandom;

        System.out.println("sumUnboundRandom = " + sumUnboundRandom);

    }
}
