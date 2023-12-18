public class TestEncapsulation {
    public static void main(String[] args) {
        // setting values of the variables
        Encapsulate encapsulate = new Encapsulate();

        encapsulate.setGeekName("Monir");
        encapsulate.setGeekAge(28);
        encapsulate.setGeekRoll(101);

        // Displaying values of the variables
        System.out.println("Geek's name: "+encapsulate.getGeekName());
        System.out.println("Geek's age: "+encapsulate.getGeekAge());
        System.out.println("Geek's roll: "+encapsulate.getGeekRoll());

        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " +obj.geekName);
    }
}
