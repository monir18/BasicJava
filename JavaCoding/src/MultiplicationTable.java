import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }
}
