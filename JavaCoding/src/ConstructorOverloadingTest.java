public class ConstructorOverloadingTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.displayInformation();

        Teacher teacher1 = new Teacher("Moniruzzaman Monir", "Male", 30, "monir.bu18@gmail.com","01775112728");
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher("Fahim Khan","Male", 28, "fahim@gmail.com");
        teacher2.displayInformation();
    }
}
