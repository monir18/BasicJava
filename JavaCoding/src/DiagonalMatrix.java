import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[3][3];
        int sumOfDiagonalElements = 0, sumOfUpperElements = 0, sumOfLowerElements = 0;

        // Getting input for A matrix
        System.out.println("Enter elements for A matrix");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                //System.out.printf("A[%d][%d] = ",row,col);
                A[row][col]=scanner.nextInt();
            }
        }

        // diagonal,upper and lower
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                //System.out.printf("B[%d][%d] = ",row,col);
                //Diagonal Element
                if (row == col){
                    sumOfDiagonalElements = sumOfDiagonalElements+A[row][col];
                }

                //upper triangle element
                if (row < col){
                    sumOfUpperElements = sumOfUpperElements+A[row][col];
                }
                //lower triangle element
                if (row > col){
                    sumOfLowerElements = sumOfLowerElements+A[row][col];
                }
            }
        }
        System.out.println("Sum of diagonal elements : "+sumOfDiagonalElements);
        System.out.println("Sum of upper elements : "+sumOfUpperElements);
        System.out.println("Sum of lower elements : "+sumOfLowerElements);
    }
}
