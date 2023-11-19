import java.util.Scanner;

public class HowToReverseANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter reverse number = ");
        int n = scanner.nextInt();
        int reverseNumber = 0, temp, r;
        temp = n;
        while (temp != 0){
            r = temp % 10;
            reverseNumber = reverseNumber*10+r;
            temp = temp / 10;
        }
        System.out.print("Reverse Number = "+reverseNumber);
    }
}
