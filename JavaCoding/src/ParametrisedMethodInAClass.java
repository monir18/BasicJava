public class ParametrisedMethodInAClass {
    String name, gender, email, phone;
    int age;

    void setInformation(String name, String gender, String email, int age, String mobile){
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.age = age;
        this.phone = mobile;
    }

    void displayInformation(){
        System.out.println("Name = "+name);
        System.out.println("Gender = "+gender);
        System.out.println("Age = "+age);
        System.out.println("Email = "+email);
        System.out.println("Mobile Number = "+phone);
        System.out.println();
    }
}
