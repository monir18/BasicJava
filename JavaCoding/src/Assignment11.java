import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        // find factorial of n
        int n , x = 1, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factorial : ");
        n = sc.nextInt();
        while (x <= n){
            fact = fact * x;
            x++;
        }
        System.out.println("Factorial : "+fact);
    }
}
