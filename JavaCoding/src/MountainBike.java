public class MountainBike extends Bicycle{

    // derived class

    // the MountainBike subclass adds one more field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed, int startHeight) {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setSeatHeight(int newValue){
        seatHeight = newValue;
    }

    // overriding toString() method of Bicycle to print more info

    public String toString(){
        return (super.toString() + "\nseat height is "+seatHeight);
    }
}
