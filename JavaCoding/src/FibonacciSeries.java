import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        //Fibonacci series | 0 1 1 2 3 5 ... n

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers = ");
        int n = scanner.nextInt();

        int first = 0, second = 1, fibo;
        System.out.print(first+" "+second);
        for (int i = 3; i <= n; i++){
            fibo = first + second;
            System.out.print(" "+fibo);
            first = second;
            second = fibo;
        }
    }
}
