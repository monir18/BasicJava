public class Teacher {
    String name, gender, email, mobileNumber;
    int age;

    Teacher(){
        System.out.println("No Information");
        System.out.println();
    }

    Teacher(String n, String g, int ag, String em){
        name = n;
        gender = g;
        age = ag;
        email = em;
    }

    Teacher(String n, String gn, int ag, String em, String phone){
        name = n;
        gender = gn;
        age = ag;
        email = em;
        mobileNumber = phone;
    }

    void displayInformation(){
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Age = "+age);
        System.out.println("E-mail = "+email);
        System.out.println("Mobile Number = "+mobileNumber);
        System.out.println();
    }
}
