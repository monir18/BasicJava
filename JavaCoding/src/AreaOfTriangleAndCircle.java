import java.util.Scanner;

public class AreaOfTriangleAndCircle {
    public static void main(String[] args) {

        //Area of triangle
        Scanner input = new Scanner(System.in);
        double base,height,area;

        System.out.print("Enter base : ");
        base = input.nextDouble();

        System.out.print("Enter height : ");
        height = input.nextDouble();

        area = 0.5*base*height;
        System.out.println("Area of triangle : " +area);

        //Area of circle
        Scanner circle = new Scanner(System.in);
        double radious,py=3.1416, area2;
        System.out.println("Enter radious : ");
        radious = circle.nextDouble();
        area2 = py * radious * radious;
        System.out.println("Area of circle : "+area2);
    }
}
