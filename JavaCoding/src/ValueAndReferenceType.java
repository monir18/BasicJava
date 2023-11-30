public class ValueAndReferenceType {
    public static void main(String[] args) {
        // value type
        int x = 5;
        int y = x;
        x = 7;
        System.out.println("X = "+x);
        System.out.println("Y = "+y);

        //reference type but working value type
        String s1 = "Hello";
        String s2 = s1;
        s1 = "Word";

        System.out.println("S1 = "+s1);
        System.out.println("S2 = "+s2);//

        // reference type
        Person p1 = new Person();
        p1.age = 50;
        Person p2 = new Person();
        p2=p1;
        p1.age = 60;

        System.out.println("P1 = "+p1.age);
        System.out.println("P2 = "+p2.age);
    }
}
