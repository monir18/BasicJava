import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any positive number : ");
        num = input.nextInt();
        if (num > 0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }

        // else if ladder syntax
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.println("Enter any number : ");
        n = inp.nextInt();
        if (n > 0){
            System.out.println("Positive");
        }
        if (n < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Equal to Zero");
        }
    }
}
