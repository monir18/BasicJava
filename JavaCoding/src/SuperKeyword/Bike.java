package SuperKeyword;

public class Bike extends Vehicle{
    int brake;
    Bike(String c, double w, int g,int b){
        super(c,w,g);
        brake = b;
    }

    @Override
    void attribute() {
        super.attribute();
        System.out.println("Brake : "+brake);
    }
}
