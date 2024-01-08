package SuperKeyword;

public class Vehicle {
    String color;
    double weight;
    int gear;

    Vehicle(String c, double w, int g){
        color = c;
        weight = w;
        gear = g;
    }

    void attribute(){
        System.out.println("Color : "+color);
        System.out.println("Weight : "+weight);
        System.out.println("Gear : "+gear);
    }
}
