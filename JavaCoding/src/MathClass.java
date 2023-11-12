import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        int a = 20, b = -10;
        double f = 18.98;

        // Return Maximum Number
        int max = Math.max(a, b);
        System.out.println("Maximum Number = "+max);

        // Return Minimum Number
        int min = Math.min(a, b);
        System.out.println("Minimum Number = "+min);

        // Return absolute number
        int absolute = Math.abs(b);
        System.out.println("Absolute of b = "+absolute);

        // Return power
        double power = Math.pow(a, b);
        System.out.println("a to the power b = "+power);

        // Return round
        int round = Math.round(18.8f);
        System.out.println("Round of 18.8 = "+round);

        // Return pi
        double pi = Math.PI;
        System.out.println("PI = "+pi);

        // Return Floor
        double floor = Math.floor(f);
        System.out.println("Floor = "+floor);

        // Return ceiling
        double ceiling = Math.ceil(f);
        System.out.println("Ceil = "+ceiling);
    }
}
