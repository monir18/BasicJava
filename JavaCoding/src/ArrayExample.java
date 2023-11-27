public class ArrayExample {
    public static void main(String[] args) {
        int[][] number = new int[4][];
        int k = 0;
        number[0] = new int[1];
        number[1] = new int[2];
        number[2] = new int[3];
        number[3] = new int[4];

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < row+1; col++) {
                number[row][col] = k;
                k++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" "+number[i][j]);
            }
            System.out.println();
        }
    }
}
