public class Encapsulate {
    //The program to access variables of the class EncapsulateDemo is shown below:

    // private variables declared
    // these can only be accessed by public methods of class
    private String geekName;
    private int geekRoll;
    private int geekAge;

    // get method for age to access
    // private variable geekAge

    public int getGeekAge(){
        return geekAge;
    }

    // get method for name to access
    // private variable geekName

    public String getGeekName(){
        return geekName;
    }

    // get method for roll to access
    // private variable geekRoll

    public int getGeekRoll(){
        return geekRoll;
    }

    // set method for age to access
    // private variable geekAge

    public void setGeekAge(int age){
        this.geekAge = age;
    }

    // set method for name to access
    // private variable geekName

    public void setGeekName(String name){
        this.geekName = name;
    }

    // set method for roll to access
    // private variable geekRoll

    public void setGeekRoll(int roll){
        this.geekRoll = roll;
    }

}
