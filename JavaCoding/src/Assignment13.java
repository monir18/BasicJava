import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which fibonacci number you want to see? ");
        int n = scanner.nextInt();

        int first = 0,second = 1, fibo = 0;
        System.out.print(first + " " + second);
        for (int i = 3; i <= n; i++){
            fibo = first + second;
            System.out.print(" "+fibo);
            first = second;
            second = fibo;
        }
        System.out.println(" \n"+fibo);
        System.out.println("Your "+n+"th position number is "+fibo);
    }
}
