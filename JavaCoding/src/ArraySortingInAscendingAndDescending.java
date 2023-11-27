import java.util.Arrays;

public class ArraySortingInAscendingAndDescending {
    public static void main(String[] args) {
        int[] number = {10, 5, 1, 16, 0, 11};

        Arrays.sort(number);

        System.out.print("Ascending : ");
        for (int i = 0; i < 6; i++) {
            System.out.print(" "+number[i]);
        }

        System.out.println();

        System.out.print("Descending : ");
        for (int i = 5; i >=0 ; i--) {
            System.out.print(" "+number[i]);
        }

        System.out.println("\n");
        String[] names = {"Monir","Ashik","Hridoy","Tousif","Kamal"};
        Arrays.sort(names);
        System.out.print("Ascending : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+names[i]);
        }
        System.out.println();
        System.out.print("Descending : ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(" "+names[i]);
        }
    }
}
