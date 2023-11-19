import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n = scanner.nextInt();
        int temp, r, palindromeNumber = 0;
        temp = n;
        while (temp != 0){
            r = temp % 10;
            palindromeNumber = palindromeNumber * 10 + r;
            temp = temp / 10;
        }
        System.out.print("Search palindrome Number = "+palindromeNumber);
        if (n == palindromeNumber)
            System.out.println("\n"+palindromeNumber+" is a Palindrome Number");
        else
            System.out.println("\n"+palindromeNumber+" is not a Palindrome Number");
    }
}
