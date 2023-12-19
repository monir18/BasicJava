public class TestInheritingPrivateMember {
    public static void main(String[] args) {
        InheritingPrivateMemberTeacher teacher = new InheritingPrivateMemberTeacher();
        teacher.setName("Md. Moniruzzaman Monir");
        teacher.setAge(29);
        teacher.setQualification("BSc in CSE");
        teacher.displayInformation2();
    }
}
