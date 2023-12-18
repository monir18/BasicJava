public class TestBicycle {
    public static <mountainBike> void main(String[] args) {
        MountainBike mountainBike = new MountainBike(3,100,25);
        System.out.println(mountainBike.toString());
        System.out.println();
        mountainBike mb = (mountainBike) new Bicycle(4,120);
        System.out.println(mb.toString());
        System.out.println();
        Bicycle bicycle = new MountainBike(5,180,32);
        System.out.println(bicycle.toString());
    }
}
