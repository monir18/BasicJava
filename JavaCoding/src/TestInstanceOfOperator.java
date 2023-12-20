public class TestInstanceOfOperator {
    public static void main(String[] args) {
        InstanceOfOperatorAnimal animal = new InstanceOfOperatorAnimal();
        InstanceOfOperatorPerson person = new InstanceOfOperatorPerson();
        InstanceOfOperatorTeacher teacher = new InstanceOfOperatorTeacher();

        System.out.println(animal instanceof InstanceOfOperatorAnimal);
        System.out.println(person instanceof InstanceOfOperatorPerson);
        System.out.println(teacher instanceof InstanceOfOperatorTeacher);
        System.out.println(teacher instanceof InstanceOfOperatorAnimal);
        System.out.println(person instanceof InstanceOfOperatorTeacher);
    }
}
