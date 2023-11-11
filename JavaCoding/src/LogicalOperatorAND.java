import java.util.Scanner;

public class LogicalOperatorAND {
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any letter : ");
        c = sc.next().charAt(0);

        if (c >= 'a' && c <= 'z'){
            System.out.println("Small Letter");
        } else if (c >= 'A' && c <= 'Z') {
            System.out.println("Capital Letter");
        }
        else {
            System.out.println("Not a letter");
        }
    }
}
