import java.util.Scanner;

public class PatternRelatedPrograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter line numbers = ");
        int n = scanner.nextInt();

        /*
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= row; col++){
                //System.out.print(" "+col);
                System.out.print(" * ");
            }
            System.out.println();
        }

        */
        /*
        for (int row = n; row >= 1; row--){
            for (int col = row; col >= 1; col--){
                System.out.print(" "+col);
            }
            System.out.println();
        }

         */

        for (int row = n; row >= 1; row--){
            for (int col = 1; col <= row; col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
}
