import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        // 1. generate and print palindrome numbers from m-n
        // 2. count and print number of palindrome numbers

        Scanner scanner = new Scanner(System.in);
        System.out.print("Start Number = ");
        int m = scanner.nextInt();

        System.out.print("End Number = ");
        int n = scanner.nextInt();

        int temp, r, sum, totalPalindrome = 0;

        for (int i = m; i <= n; i++){
            sum = 0;
            temp = i;
            while (temp != 0){
                r = temp % 10;
                sum = sum * 10 + r;
                temp = temp / 10;
            }
            if (i == sum){
                totalPalindrome++;
                System.out.println(sum+" ");
            }
        }
        System.out.println("Total Palindrome Number = "+totalPalindrome);
    }
}
