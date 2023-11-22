import java.util.Scanner;

public class ArrayFindingMaximumAndMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double[] number = new double[5];
        System.out.print("Enter five numbers : ");
        for (int i = 0; i < number.length; i++){
            number[i] = scanner.nextDouble();
            sum = sum+number[i];
        }

        double avg = sum/number.length;
        System.out.print("Sum of array : "+sum);
        System.out.print("\nAverage is "+avg);

        double max = number[0];
        double min = number[0];
        for (int i = 1; i < number.length; i++){
            if (max < number[i]){
                max = number[i];
            }
            if (min > number[i]){
                min = number[i];
            }
        }
        System.out.println("\nMaximum number is "+max);
        System.out.println("Minimum number is "+min);
    }
}
