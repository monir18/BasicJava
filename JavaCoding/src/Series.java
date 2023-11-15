import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        // 1 + 2 + 3 + ...... +n
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last number : ");
        n = sc.nextInt();
        boolean first = true;
        for (int i = 1; i <= n; i++){
            if ( first == false ){
                System.out.print(" + ");
            }
            first = false;
            System.out.print(i);
            sum = sum + i;
        }
        System.out.println(" = "+sum);

        // 1 + 3 + 5 + .......+n
        int i = 1, lastNumber, summation = 0;
        boolean f = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter last number = ");
        lastNumber = scanner.nextInt();
        while (i <= lastNumber){
            if (f == false)
                System.out.print(" + ");
            f = false;
            System.out.print(i);
            summation = summation + i;
            i = i+2;
        }
        System.out.println(" = "+summation);

        // 1.5 + 2.5 + 3.5 + ........ +n
        double d = 1.5, lastN, sumDoubleNumber = 0;
        Scanner inDouble = new Scanner(System.in);
        System.out.print("Enter last double number = ");
        lastN = inDouble.nextDouble();

        boolean b = true;
        while (d <= lastN){
            if (b == false)
                System.out.print(" + ");
            b = false;
            System.out.print(d);
            sumDoubleNumber = sumDoubleNumber + d;
            d++;
        }
        System.out.println(" = "+sumDoubleNumber);

        // 1^2 + 2^2 + 3^2 + 4^2 + ....... +n^2
        System.out.println();
        int lastNum, summ = 0;
        Scanner inputSc = new Scanner(System.in);
        System.out.print("Input last number = ");
        lastNum = inputSc.nextInt();
        boolean bool = true;
        for (int a = 1; a <= lastNum; a++){
            if (bool == false)
                System.out.print(" + ");
            bool = false;
            System.out.print(a+"X"+a);
            summ = summ + a*a;

        }
        System.out.println(" = "+summ);
    }
}
