public class CallByMethod {
    public static void main(String[] args) {
        ParametrisedMethodInAClass teacher = new ParametrisedMethodInAClass();
        teacher.setInformation("Moniruzzaman Monir", "Male","monir.bu18@gmail.com",30,"01775112728");
        teacher.displayInformation();

        teacher.setInformation("Rudaba Admin Akter Jui", "Female","rudabajui90@gmail.com",30,"01304677690");
        teacher.displayInformation();
    }
}
