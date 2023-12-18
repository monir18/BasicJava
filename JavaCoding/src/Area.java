public class Area {

    //Examples Showing Data Encapsulation in Java
    private int length;
    private int breadth;

    //constructor to initialize values

    Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    //method to calculate area
    public void getArea(){
        int area = length*breadth;
        System.out.println("Area : "+area);
    }
}
