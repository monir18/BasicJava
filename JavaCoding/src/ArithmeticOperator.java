import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        /*
        int number1;
        int number2;
        number1 = 101;
        number2 = 333;
         */

        //int number1 = 20, number2 = 10, result;

        int number1, number2, result;
        Scanner inputNumber1 = new Scanner(System.in);
        System.out.print("Enter First Number = ");
        number1 = inputNumber1.nextInt();

        Scanner inputNumber2 = new Scanner(System.in);
        System.out.print("Enter Second Number = ");
        number2 = inputNumber2.nextInt();

        result = number1 + number2;
        System.out.println("Summation = " +result);

        result = number1 - number2;
        System.out.println("Substraction = " +result);

        result = number1 * number2;
        System.out.println("Multiplication = " +result);

        double result2 = (double) number1 / number2;
        System.out.println("Divided = " +result2);

        result = number1 % number2;
        System.out.println("Reminder = " +result);
    }
}
