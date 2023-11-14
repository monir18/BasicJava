import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        // print sum of odd numbers from m-n
        /*
        int m,n,sumOfOddNumber=0;
        Scanner inputNumbers = new Scanner(System.in);

        System.out.print("Enter m number : ");
        m = inputNumbers.nextInt();

        System.out.print("Enter n number : ");
        n = inputNumbers.nextInt();

        while(m <= n){
            sumOfOddNumber = sumOfOddNumber + m;
            m = m+2;
        }
        System.out.println("Sum of Odd Number = "+sumOfOddNumber);
*/

        System.out.println("Second Way");
        System.out.println("------------");
        int m2,n2,sumOfOddNumber2=0;
        Scanner inputNumbers2 = new Scanner(System.in);

        System.out.print("Enter m2 number : ");
        m2 = inputNumbers2.nextInt();

        System.out.print("Enter n2 number : ");
        n2 = inputNumbers2.nextInt();
        while (m2 <= n2){
            if (m2%2 != 0){
                sumOfOddNumber2 = sumOfOddNumber2 + m2;
            }
            m2++;
        }
        System.out.println("Sum of Odd Number = "+sumOfOddNumber2);
    }
}
