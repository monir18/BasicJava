public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 32, b = 12, c;

        // Bitwise AND(&)
        c = a & b;
        System.out.println("a & b = "+c);

        // Bitwise inclusive OR(|)
        c = a | b;
        System.out.println("a | b = "+c);

        // Bitwise exclusive OR(^)
        c = a ^ b;
        System.out.println("a ^ b = "+c);
    }
}
