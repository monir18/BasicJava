import java.util.Scanner;

public class ArrayMatrix {
    public static void main(String[] args) {
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] C = new int[2][3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements for A matrix");
        // getting input for A matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] = ",row,col);
                A[row][col] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements for B matrix");
        // getting input for B matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d] = ",row,col);
                B[row][col] = scanner.nextInt();
            }
        }
        System.out.println();
        //printing input for A matrix
        System.out.print("A = ");
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("\t "+A[r][c]);
            }
            System.out.println();
        }
        System.out.println();
        //printing input for B matrix
        System.out.print("B = ");
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("\t "+B[r][c]);
            }
            System.out.println();
        }

        System.out.println();
        // Adding A and B matrix
        System.out.print("A+B = ");
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 3; c++) {
                C[r][c]=A[r][c]+B[r][c];
                System.out.print("\t "+(C[r][c]));
                //System.out.print("\t "+(A[r][c]+B[r][c]));
            }
            System.out.println();
        }

    }
}
