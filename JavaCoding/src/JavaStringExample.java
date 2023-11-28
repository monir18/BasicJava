import java.util.Locale;
import java.util.function.Supplier;

public class JavaStringExample {
    public static void main(String[] args) {
        String firstName = "Moniruzzaman";
        String lastName = " Monir";
        //uses concat method
        /*
        String fullName = firstName + lastName;
        System.out.println(fullName);
         */
        String fullName;

        fullName = firstName.concat(lastName);
        System.out.println("Full Name = "+fullName);

        String upperName = firstName.toUpperCase();
        System.out.println("Upper Name : "+ upperName);

        String lowerName = fullName.toLowerCase();
        System.out.println("Upper Name : "+ lowerName);

        boolean startWith = fullName.startsWith("Mo");
        System.out.println("Starts With : "+startWith);
        boolean endWith = fullName.startsWith("R");
        System.out.println("End With : "+endWith);

        String[] names = {"Anis","Rudaba","Monir","Sagor"};
        for (String name:names) {
            System.out.println(name);
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }

    }
}
