package by.serg.pol;

import java.util.Random;

public class RandomGeneratorDemo {

    public static void main(String[] args) {

        Random randomGenerator;
        randomGenerator = new Random();

        int firstRandomNumber = randomGenerator.nextInt();
        int nextRandomNumber = randomGenerator.nextInt();
        int lastRandomNumber = randomGenerator.nextInt(100);

        System.out.println(firstRandomNumber);
        System.out.println(nextRandomNumber);
        System.out.println(lastRandomNumber);

        int summaRandonNumber = firstRandomNumber + nextRandomNumber + lastRandomNumber;

        System.out.println("summaRandonNumber = " + summaRandonNumber);
    }


}
















