public class Encapsulation {
    public static void main(String[] args) {
        EncapsulationPerson person = new EncapsulationPerson();
        person.setName("Rudaba");

        String name = person.getName();
        System.out.println(name);

        person.setAge(31);
        int age = person.getAge();
        System.out.println(age);
        //person.display();
    }
}
