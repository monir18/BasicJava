import java.util.Scanner;

public class FindFactorialNumber {
    public static void main(String[] args) {
        int fact, num, result = 1;
        System.out.print("Enter factorial value = ");
        Scanner sc = new Scanner(System.in);
        fact = sc.nextInt();
        num = fact;
        while (num >= 1){
            result = result * num;
            num--;
        }
        System.out.println("Factorial of "+ fact +" = "+result);
    }
}
