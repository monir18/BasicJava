import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // Print sum of all the numbers from 1 to 10
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum = sum+i;
            //System.out.println(sum);
        }
        System.out.println("Total Summation 1 to 10 = " +sum);

        // Print sum of all the numbers from m to n
        int m, n, summation = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m number : ");
        m = sc.nextInt();
        System.out.print("Enter n number : ");
        n = sc.nextInt();

        while (m <= n){
            summation = summation + m;
            m++;
        }
        System.out.println("Total Summation M to N = " +summation);

        // Print sum of all the even numbers m to n
        int m2, n2, sumEven = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter m2 number : ");
        m2 = scanner.nextInt();
        System.out.print("Enter n2 number : ");
        n2 = scanner.nextInt();

        while (m2 <= n2){
            if (m2 % 2 == 0){
                sumEven = sumEven + m2;
            }
            m2++;
        }
        System.out.println("Total Summation M2 to N2 Even Number = " +sumEven);

        // Print sum of all the odd numbers m to n
        int m3, n3, sumOdd = 0;
        Scanner inputNumbers = new Scanner(System.in);
        System.out.print("Enter m3 number : ");
        m3 = inputNumbers.nextInt();
        System.out.print("Enter n3 number : ");
        n3 = inputNumbers.nextInt();

        while (m3 <= n3){
            if (m3 % 2 != 0){
                sumOdd = sumOdd + m3;
            }
            m3++;
        }
        System.out.println("Total Summation M3 to N3 Odd Number = " +sumOdd);
    }
}
