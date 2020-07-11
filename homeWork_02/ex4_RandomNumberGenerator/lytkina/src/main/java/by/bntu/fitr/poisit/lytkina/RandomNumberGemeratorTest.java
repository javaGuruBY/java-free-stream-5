package by.bntu.fitr.poisit.lytkina;

import java.util.Random;

public class RandomNumberGemeratorTest {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int firstRandomNumber = randomGenerator.nextInt(11);//[0, 10]
        int secondRandomNumber = randomGenerator.nextInt(10)+11;//[11, 20]
        int thirdRandomNumber = randomGenerator.nextInt(10)+21;//[21, 30]
        int sumOfRandomNumbers = firstRandomNumber + secondRandomNumber + thirdRandomNumber;
        
        System.out.println("first random number is " + firstRandomNumber);
        System.out.println("second random number is " + secondRandomNumber);
        System.out.println("third random number is " + thirdRandomNumber);
        System.out.println("sum of three " + sumOfRandomNumbers);
    }

}
