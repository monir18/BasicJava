import java.util.Scanner;

public class BitwiseAndExample {
    public static void main(String[] args) {
        int num1, num2, result;
        Scanner inputNumbers = new Scanner(System.in);
        System.out.println("Enter num1 and num2 : ");
        num1 = inputNumbers.nextInt();
        num2 = inputNumbers.nextInt();
        result = (num1 & num2);
        System.out.println("num1 & num2 = "+result);
    }
}
