public class ConstructorExample {
    String name, gender, mobileNumber, email;
    int age;

    ConstructorExample(){
        System.out.println("No Value");
        System.out.println();
    }
    ConstructorExample(String n, String g, int a, String em, String mobile){
        name = n;
        gender = g;
        age = a;
        email = em;
        mobileNumber = mobile;
    }
    void displayInformation(){
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Age = "+age);
        System.out.println("Email = "+email);
        System.out.println("Mobile Number = "+mobileNumber);
        System.out.println();
    }
}
