public class UnaryOperator {
    public static void main(String[] args) {
        int x = -10, result;

        //Unary minus
        result = -x;
        System.out.println("Result = " +result);

        //Unary Plus
        result = +x;
        System.out.println("Result = " +result);

        // Postfix increment
        int a = 25, b;
        b = a++; //post increment
        System.out.println("B = "+b);

        b = a;
        System.out.println("B = "+b);

        // Prefix increment
        int m = 25, n;
        n = ++m; //pre increment
        System.out.println("N = "+n);

        n = m;
        System.out.println("N = "+n);

        // Postfix decrement
        int r = 25,o;
        o = r--; //post decrement
        System.out.println("O = "+o);

        o = r;
        System.out.println("O = "+o);

        // Prefix decrement
        int k = 25,l;
        l = --k; //pre decrement
        System.out.println("L = "+l);

        l = k;
        System.out.println("L = "+l);
    }
}
