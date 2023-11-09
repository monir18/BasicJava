import java.util.Scanner;

public class NestedIfElseStatement {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner inputNum1 = new Scanner(System.in);
        System.out.print("Enter number1 = ");
        num1 = inputNum1.nextInt();

        Scanner inputNum2 = new Scanner(System.in);
        System.out.print("Enter number2 = ");
        num2 = inputNum2.nextInt();

        Scanner inputnum3 = new Scanner(System.in);
        System.out.print("Enter number3 = ");
        num3 = inputnum3.nextInt();

        if (num1 > num2){
            // This is called nested if-else
            if (num1 > num3){
                System.out.println("Number1 is Largest"+num1);
            }
            else {
                System.out.println("Number3 is Largest"+num3);
            }
        }
        else {
            if (num2 > num3){
                System.out.println("Number2 is Largest"+num2);
            }
            else {
                System.out.println("Number3 is Largest");
            }
        }
    }
}
