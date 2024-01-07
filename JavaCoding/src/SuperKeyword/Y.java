package SuperKeyword;

public class Y extends X{
    @Override
    void display() {
        message();
        super.display();
        System.out.println("Inside Y class");
    }
}
