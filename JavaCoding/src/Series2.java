import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        // 1 X 2 X 3 X ...... Xn
        int lastNumber, sum = 1;
        Scanner inputLastNumber = new Scanner(System.in);
        System.out.print("Enter last number = ");
        lastNumber = inputLastNumber.nextInt();

        boolean b = true;
        for (int i = 1; i <= lastNumber; i++){
            if (b == false)
                System.out.print(" X ");
            b = false;
            System.out.print(i);
            sum = sum * i;
        }
        System.out.println(" = " +sum);
        System.out.println();

        // 1 X 3 X 5 X .......Xn
        int lastNum, summ = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter last number = ");
        lastNum = scanner.nextInt();
        boolean bool = true;
        for (int i = 1; i <= lastNum; i = i+2){
            if (bool == false)
                System.out.print(" X ");
            bool = false;
            System.out.print(i);
            summ = summ * i;
        }
        System.out.println(" = " +summ);
        System.out.println();

        // 1.5 X 2.5 X 3.5 X ........ Xn
        double a = 1.5, inputLNumber, sumDoubleNumber = 1;
        System.out.print("Enter last number = ");
        Scanner sc = new Scanner(System.in);
        inputLNumber = sc.nextDouble();
        boolean bol = true;
        while (a <= inputLNumber){
            if (bol == false)
                System.out.print(" X ");
            bol = false;
            System.out.print(a);
            sumDoubleNumber = sumDoubleNumber * a;
            a++;
        }
        System.out.println(" = " +sumDoubleNumber);
        System.out.println();

        // 1^2 X 2^2 X 3^2 X 4^2 X ....... Xn^2
        int m = 1, lastN, result = 1;
        System.out.print("Enter last number = ");
        Scanner scLastN = new Scanner(System.in);
        lastN = scLastN.nextInt();
        boolean bl = true;
        while (m <= lastN){
            if (bl == false)
                System.out.print(" X ");
            bl = false;
            System.out.print(m+"*"+m);
            result = result * m*m;
            m++;
        }
        System.out.println(" = "+result);
    }
}
