import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        // Create a pattern like following one if n=4
        /*
         1
         1 0
         1 0 1
         1 0 1 0
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter line numbers = ");
        int n = scanner.nextInt();
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                if (col%2==0)
                    System.out.print(" 0 ");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}
