package MethodOverriding;

public class SuperClassB extends SuperClassA{
    @Override
    void display() {
        super.display();
        message();
        System.out.println("Inside B class");
    }
}
