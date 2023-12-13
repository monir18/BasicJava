public class StaticStudentExample {
    String name;
    int id;
    static String universityName = "BU";

    StaticStudentExample(String name, int id){
        this.name = name;
        this.id = id;
    }

    void disPlayInformation(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("University Name : "+universityName);
        System.out.println();
    }
}
