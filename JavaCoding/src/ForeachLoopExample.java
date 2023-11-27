import java.util.Arrays;
import java.util.Scanner;

public class ForeachLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double[] numbers = new double[4];
        System.out.print("Enter five numbers : ");
        double maximum = 0,minimum = 0;
        for (double item:numbers) {
            item = scanner.nextDouble();
            //numbers[0]=item;
            maximum = item;
            minimum = item;

            sum = sum+item;

        }

        for (int i = 1; i < numbers[i]; i++){
            if (maximum < numbers[i]){
                maximum = numbers[i];
            }
            if (minimum > numbers[i]){
                minimum = numbers[i];
            }
        }
        double avg = sum/numbers.length;
        System.out.println("Summation of array numbers = "+sum);
        System.out.println("Average is = "+avg);
        System.out.println("Minimum number is "+minimum);
        System.out.println("\nMaximum number is "+maximum);
    }
}
