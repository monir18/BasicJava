public class InstanceVariableHiding {
    private double height, width, depth; // Instance Variable

    InstanceVariableHiding(double height, double width, double depth){ //Local Variable
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void displayVol(){
        double vol = height*width*depth;
        System.out.println("Volume is : "+vol);
    }
}
