package MethodOverriding;

public class Teacher extends Person{
    String qualification;

    @Override
    void displayInformation() {
        super.displayInformation();
        System.out.println("Qualification = "+qualification);
    }
}
