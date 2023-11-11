import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        /*
        Logical or assignment
        step 1: Print "Do you love java? "
        step 2: take user input y / Y / n / N
        step 3: if user input y / Y then print you are a java lover
        step 4: if user input n / N then print you are not a java lover
         */
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you love java? ");
        c = sc.next().charAt(0);
        if (c == 'y' || c == 'Y'){
            System.out.println("You are a java lover");
        }
        else {
            System.out.println("You are not a java lover");
        }
    }
}
