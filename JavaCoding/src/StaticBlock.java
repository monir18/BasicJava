public class StaticBlock {
    public static void main(String[] args) {
        //StaticBlock.display();
        //display();
        System.out.println("Main method");
    }
    /*
    static int id;
    static String name;
     */

    static {
        /*
        id = 101;
        name = "Rudaba Jui";
         */
        System.out.println("Static");
    }

    /*
    static void display(){
        System.out.println("Id = "+id);
        System.out.println("Name = "+name);
    }
     */


}
