import java.util.Scanner;

public class PrimeNumbersFromMtoN {
    public static void main(String[] args) {
        int m,n,count=0,totalCountPrimeNumber=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial number = ");
        m = scanner.nextInt();

        System.out.print("Enter ending number = ");
        n = scanner.nextInt();

        for (int i = m; i <= n; i++){
            //System.out.println(i);
            if (i == 1 || i == 0)
                continue;
            //System.out.println(i);
            for (int j = 2; j <= i-1; j++){
                if (i%j==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println(i);
            }
            count = 0;
        }
    }
}
