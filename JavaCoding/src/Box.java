public class Box {
    double height, width, depth;
    Box(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void displayVol(){
        double result = height*width*depth;
        System.out.println("The result is = "+result);
    }
}
