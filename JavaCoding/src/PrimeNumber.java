import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter any positive integer : ");
        Scanner scanner = new Scanner(System.in);
        int primeNumber = scanner.nextInt();
        int count = 0;
        if (primeNumber == 0 || primeNumber == 1)
            System.out.println("Not Prime Number");
        else {
            for (int i = 2; i < primeNumber / 2; i++){
                if (primeNumber % i == 0){
                    count++;
                    break;
                }
            }
            if (count == 0)
                System.out.println("Prime Number.");
            else
                System.out.println("Not Prime Number");
        }
    }
}
