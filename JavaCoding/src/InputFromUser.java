import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter any number : ");
        number = input.nextInt();
        System.out.println("Number = "+number);

        /*
        String name = "Monir";
        System.out.println("Name is : "+name);
         */

        Scanner inputString = new Scanner(System.in);
        String name;
        System.out.print("Enter your name : ");
        name = inputString.next();
        System.out.println("Welcome, "+name);

        Scanner inputString2 = new Scanner(System.in);
        String name2;
        System.out.print("Enter your name2 : ");
        name2 = inputString2.nextLine();
        System.out.println("Welcome, "+name2);

        Scanner inputFloat = new Scanner(System.in);
        float f;
        System.out.print("Enter any float number : ");
        f=inputFloat.nextFloat();
        System.out.println("Float Number is : "+f);

        Scanner inputDouble = new Scanner(System.in);
        double d;
        System.out.println("Enter any double number : ");
        d = inputDouble.nextDouble();
        System.out.println("Double number is : "+d);
    }
}
