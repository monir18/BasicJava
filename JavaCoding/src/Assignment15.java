import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        // 1. generate and print armstrong numbers from m-n
        // 2. count and print number of armstrong numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Start Number = ");
        int m = scanner.nextInt();

        System.out.print("End Number = ");
        int n = scanner.nextInt();

        int r, temp, sum, totalArmstrongNumber = 0;
        for (int i = m; i <= n; i++){
            sum = 0;
            temp = i;
            while (temp != 0){
                r = temp % 10;
                sum = sum+r*r*r;
                temp = temp / 10;
            }
            if (m == sum){
                totalArmstrongNumber++;
                System.out.println(sum+" ");
            }
        }
        System.out.println("Total Armstrong Number = "+totalArmstrongNumber);
    }
}
