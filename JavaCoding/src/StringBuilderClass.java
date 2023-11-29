public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Moniruzzaman ");
        System.out.println("Str = "+stringBuilder);

        stringBuilder.append("Monir ");
        stringBuilder.append(28 +" ");
        stringBuilder.append(12.12);
        System.out.println(stringBuilder);

        stringBuilder.delete(0,2);
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
