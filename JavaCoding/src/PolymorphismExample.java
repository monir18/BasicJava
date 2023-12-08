public class PolymorphismExample {
    public static void main(String[] args) {
        PolymorphismPerson person = new PolymorphismPerson();
        person.display();
        /*
        PolymorphismTeacher teacher = new PolymorphismTeacher();
        PolymorphismStudent student = new PolymorphismStudent();
        */

        /*
        teacher.display();
        student.display();
         */
        person = new PolymorphismTeacher();
        person.display();
        person = new PolymorphismStudent();
        person.display();
    }
}
