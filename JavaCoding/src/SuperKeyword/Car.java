package SuperKeyword;

public class Car extends Vehicle{

    int brake;
    Car(String c, double w, int g, int b){
        super(c,w,g); //calling the constructor vehicle class
    }

    @Override
    void attribute() {
        super.attribute();
        System.out.println("Brake : "+brake);
    }
}
