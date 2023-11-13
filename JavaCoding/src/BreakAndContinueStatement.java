public class BreakAndContinueStatement {
    public static void main(String[] args) {
        //break statement
        System.out.println("Break Statement");
        System.out.println("----------------");
        for (int i = 1; i <= 100; i++){
            if (i == 10){
                break;
            }
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Continue Statement");
        System.out.println("-------------------");
        //continue statement
        for (int a = 1; a <= 100; a++){
            if (a == 10)
                continue;
            System.out.println(a);
        }

        System.out.println();
        System.out.println("Continue & Break Statement");
        System.out.println("---------------------------");
        for (int m = 1; m <= 100; m++){
            if (m == 10){
                continue;
            }
            if (m == 15){
                break;
            }
            System.out.println(m);
        }
    }
}
