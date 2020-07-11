package by.bntu.fitr.poisit.lytkina;

public class MathOperationsDemo {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        System.out.println("the division is " + division(firstNumber, secondNumber));
        System.out.println("the sum is " + addition(firstNumber, secondNumber));
        System.out.println("the multiplication is " + multiplication(firstNumber, secondNumber));
        System.out.println("the subtraction is " + subtraction(firstNumber,secondNumber));

    }
    public static int addition(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public static int subtraction(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
    public static double division (int firstNumber, int secondNumber){
        double result;
        if (secondNumber!=0) {
            result =  (double)firstNumber / (double)secondNumber;
        }
        else result = 0;
        return  result;
    }
    public static int multiplication (int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
}
