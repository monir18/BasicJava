import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        /*
        switch assignment: call center
        if user select option 1 then set language bengali
        if user select option 2 then set language hindi
        if user select option 3 then set language urdu
        for any other option set language english
         */

        int digit;
        System.out.println("Enter a digit : ");
        Scanner inputDigit = new Scanner(System.in);
        digit = inputDigit.nextInt();

        switch (digit){
            case 1:
                System.out.println("set language bengali");
                break;
            case 2:
                System.out.println("set language hindi");
                break;
            case 3:
                System.out.println("set language urdu");
                break;
            default:
                System.out.println("set language english");
        }
    }
}
