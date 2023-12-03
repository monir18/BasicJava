// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ConstructorExample teacher = new ConstructorExample("Moniruzzaman Monir","Male",30,"monir.bu18@gmail.com","01775112728");
        teacher.displayInformation();

        ConstructorExample teacher2 = new ConstructorExample();
        teacher2.displayInformation();

        ConstructorExample teacher3 = new ConstructorExample("Abdul Aziz","Male",75,"aiz.pr1954@gmail.com","01787891080");
        teacher3.displayInformation();
    }
}