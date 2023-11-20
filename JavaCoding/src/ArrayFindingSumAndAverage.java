import java.util.Scanner;

public class ArrayFindingSumAndAverage {
    public static void main(String[] args) {
        /*
        // first way
        Scanner scanner = new Scanner(System.in);
        double[] number = new double[5];
        System.out.println("Please enter five numbers : ");
        number[0] = scanner.nextDouble();
        number[1] = scanner.nextDouble();
        number[2] = scanner.nextDouble();
        number[3] = scanner.nextDouble();
        number[4] = scanner.nextDouble();
        double sum = 0;
        sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println("The sum of array is : "+sum);

        double avarage = sum / 5;
        System.out.println("Avarage = "+avarage);
*/
        //Second way
        double[] num = new double[5];
        double sum2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter five numbers : ");
        for (int i = 0; i < 5; i++){
            num[i] = sc.nextDouble();
        }
        for (int i = 0; i < num.length; i++){
            sum2 = sum2+num[i];
        }
        System.out.println("The sum is : "+sum2);
        double avg = sum2/ num.length;
        System.out.println("Average is : "+avg);
    }
}
