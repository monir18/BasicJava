public class JavaStringExample2 {
    public static void main(String[] args) {
        String country = "      Bangladesh is my country";

        System.out.println(country);

        char ch = country.charAt(0);
        System.out.println("ch = "+ch);

        int value = country.codePointAt(0);
        System.out.println("Value = "+value);

        int firstPosition = country.indexOf('B');
        System.out.println("First position of is = "+firstPosition);

        int lastPosition = country.lastIndexOf('n');
        System.out.println("Last position of is = "+lastPosition);

        String s3 = country.trim();
        System.out.println(s3);
    }
}
