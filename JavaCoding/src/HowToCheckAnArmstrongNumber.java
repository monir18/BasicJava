import java.util.Scanner;

public class HowToCheckAnArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How to check an Armstrong Number? ");
        int armNumber = scanner.nextInt();
        int temp, r, sum = 0;
        temp = armNumber;
        while (temp != 0){
            r = temp % 10;
            sum = sum+r*r*r;
            temp = temp / 10;
        }
        if (armNumber == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
