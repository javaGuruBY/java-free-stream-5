 
package ex3_ArithmeticOperations.Dmitry_Karachun;

import java.util.Scanner;

public class MathOperationsDemo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int firstNumber = getNumber();
        int secondNumber = getNumber();
        char operation = getOperation();
        int result = calculate(firstNumber, secondNumber, operation);
        System.out.println("Результат: " + result);
    }

    public static int getNumber() {
        System.out.println("Введите целое число:");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Введены не корректные данные.");
            scanner.next();
            number = getNumber();
        }
        return number;
    }

    public static char getOperation() {
        System.out.println("Введите требуемую математическую операцию (+, - , *, /):");
        return scanner.next().charAt(0);
    }

    public static int calculate(int number1, int number2, char operation) {
        int res;
        switch (operation) {
            case '+':
                res = number1 + number2;
                break;
            case '-':
                res = number1 - number2;
                break;
            case '*':
                res = number1 * number2;
                break;
            case '/':
                res = number1 / number2;
                break;
            default:
                System.out.println("Операция введена не корректно.");
                res = calculate(number1, number2, getOperation());
        }
        return res;
    }

}


