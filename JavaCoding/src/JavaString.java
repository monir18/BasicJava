public class JavaString {
    public static void main(String[] args) {
        String s1 = "Moniruzzaman Monir";
        String s2 = "Rudaba Admin Akter Jui";
        String s4 = ("Rudaba Admin Akter Jui");

        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);

        char[] s3 = {'r','u','d','a','b','a'};
        System.out.println(s3);

        int len = s1.length();
        System.out.println("Length of s1 = "+len);

        System.out.println("Step 1 :");
        if (s2 == s4) {
            System.out.println("Equals");
        }
        else
            System.out.println("Not Equals");

        System.out.println("Step 2 :");

        if (s2.equalsIgnoreCase(s4)){
            System.out.println("Equals");
        }
        else
            System.out.println("Not Equals");

        System.out.println("Step 3 :");
        if (s2.contains(s4)){
            System.out.println("Equals");
        }
        else
            System.out.println("Not Equals");


        System.out.println(s2.compareTo(s4));
        System.out.println();
        boolean con = s1.contains("Monir");
        System.out.println(con);

        System.out.println("Empty Method Uses : ");

        boolean b = s1.isEmpty();
        System.out.println(b);

    }
}
