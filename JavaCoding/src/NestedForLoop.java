import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m = ");
        m = sc.nextInt();
        System.out.println("Enter n = ");
        n = sc.nextInt();

        for (int i = m; i <= n; i++){
            for (int j = 1; j <= 10; j++){
                System.out.println(i+" X "+j+" = "+i*j);
            }
            System.out.println();
        }
    }
}
