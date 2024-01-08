package SuperKeyword;

public class TestSuperKeyword {
    public static void main(String[] args) {
        Car toyota = new Car("Red",250,4,1);
        toyota.attribute();

        System.out.println();
        
        Bike avenger = new Bike("Red",150,5,2);
        avenger.attribute();
    }
}
