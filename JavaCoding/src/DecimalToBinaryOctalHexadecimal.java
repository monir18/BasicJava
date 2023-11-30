import java.util.Scanner;

public class DecimalToBinaryOctalHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //decimal to binary
        System.out.print("Enter decimal number : ");

        int decimal = sc.nextInt();
        String decimalToBinary = Integer.toBinaryString(decimal);
        System.out.println("Decimal To Binary = "+decimalToBinary);

        //decimal to octal
        System.out.print("Enter decimal number : ");
        int octal = sc.nextInt();
        String octToBinary = Integer.toOctalString(octal);
        System.out.println("Decimal To Octal = "+octToBinary);

        //decimal to hexadecimal
        System.out.print("Enter decimal number : ");
        int hexadecimal = sc.nextInt();
        String hexadecimalToBinary = Integer.toHexString(hexadecimal);
        System.out.println("Decimal To Hexadecimal = "+hexadecimalToBinary);
    }
}
