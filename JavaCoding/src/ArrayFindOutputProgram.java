public class ArrayFindOutputProgram {
    public static void main(String[] args) {
        int[][] number = new int[4][5];
        int k = 0;
        //Assigning the value to the 2d array
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                number[row][col] = k;
                k++;
            }
        }

        //Printing elements
        //System.out.println(k);
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(" "+number[row][col]);
            }
            System.out.println();
        }
    }
}
