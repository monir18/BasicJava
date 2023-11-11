import java.util.Scanner;

public class CheckingEvenOddNumber {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        int number;
        System.out.println("Enter any number : ");
        number = inputNumber.nextInt();
        if (number % 2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
