public class StringPalindrome {
    public static void main(String[] args) {
        String s1 = "madam";
        StringBuffer stringBuffer = new StringBuffer(s1);
        System.out.println(stringBuffer);

        String s2 = stringBuffer.reverse().toString();
        System.out.println(stringBuffer);

        if (s1.equals(s2))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

    }
}
