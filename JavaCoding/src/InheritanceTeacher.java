public class InheritanceTeacher extends InheritancePerson {
    String qualification;

    void disPlayInformation2(){
        /*
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
         */
        displayInformation1();
        System.out.println("Qualification : "+qualification);
    }
}
