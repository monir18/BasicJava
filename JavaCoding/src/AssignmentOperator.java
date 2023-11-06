public class AssignmentOperator {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;

        x+=y; // x = x + y; Output: 5
        System.out.println("X = "+x);

        x-=y; // x = x - y; Output: 3
        System.out.println("X = "+x);

        x*=y; // x = x * y; Output: 6
        System.out.println("X = "+x);

        x/=y; // x = x / y; Output: 3
        System.out.println("X = "+x);

        x%=y; // x = x % y; Output: 1
        System.out.println("X = "+x);
    }
}
