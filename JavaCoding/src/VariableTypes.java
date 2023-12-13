public class VariableTypes {
    public static void main(String[] args) {
        VariableTypes v = new VariableTypes("Monir",101);
        v.display();
    }
    String name; // instance variable
    int id;
    static String universityName = "Bangladesh university"; //static variable

    VariableTypes(String n, int i){ // local variable
        name = n;
        id = i;
    }
/*
    static {
        universityName = "Bangladesh university";
    }

 */

    void display(){
        System.out.println("Name = "+name);
        System.out.println("Id = "+id);
        System.out.println("University Name = "+universityName);
    }
}
