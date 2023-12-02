public class OOPTest {
    public static void main(String[] args) {
        /*
        JavaClassExample teacher;//object declare
        teacher = new JavaClassExample();//object create
        */
        JavaClassExample teacher = new JavaClassExample();
        teacher.name = "Moniruzzaman";
        teacher.gender = "Male";
        teacher.phoneNumber = 1775112828;
        System.out.println("Name : "+teacher.name);
        System.out.println("Gender : "+teacher.gender);
        System.out.println("Mobile : "+teacher.phoneNumber);
    }
}
