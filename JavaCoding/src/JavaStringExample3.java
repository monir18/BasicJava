public class JavaStringExample3 {
    public static void main(String[] args) {
        String s1 = "01775-112728";
        System.out.println(s1);

        String s2 = s1.replace('1','9');
        System.out.println(s2);

        String[] s3 = s1.split("-");
        for (String items:s3) {
            System.out.println(items);
        }

    }
}
