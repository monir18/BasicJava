import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number = ");
        int num = scanner.nextInt();
        int temp, sum = 0, r;
        temp = num;
        while (temp !=0){
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }
        System.out.println("Sum of Digits : "+sum);
    }
}
