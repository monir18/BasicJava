import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        // Create a program to calculate installment amount for per month
        try(Scanner input = new Scanner(System.in)){
            int phonePrice = 1800; //1800 euros
            int numberOfInstallment, installmentPerMonth;

            // get number of installments from user
            System.out.println("Number of installments? ");
            numberOfInstallment = input.nextInt();

            // calculate installment amount for per month
            installmentPerMonth = phonePrice / numberOfInstallment;

            System.out.println("Monthly installment Amount : " +installmentPerMonth+ " euros");
        }
    }
}
