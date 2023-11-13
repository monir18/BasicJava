import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // How to calculate factorial value
        int n, fact = 1;
        Scanner inputFact = new Scanner(System.in);
        System.out.println("Enter a factorial digit : ");
        n = inputFact.nextInt();
        for (int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println("Calculate Factorial Value : "+fact);
    }
}
