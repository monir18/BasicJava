package MethodOverriding;

public class TestMethodOverriding {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Md. Moniruzzaman Monir";
        teacher.age = 29;
        teacher.qualification = "BSc in CSE";
        teacher.displayInformation();

        System.out.println();

        Person person = new Person();
        person.name = "Ripon";
        person.age = 42;
        person.displayInformation();
    }
}
