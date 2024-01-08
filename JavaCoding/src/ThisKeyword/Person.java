package ThisKeyword;

public class Person {
    String name; //instance variable
    int age; //instance variable

    String hairColor;

    Person(String name, int age){ // local variable
        this.name = name;
        this.age = age;
    }

    Person(String name, int age, String hairColor){
        //this.name = name;
        //this.age = age;
        this(name,age);
        this.hairColor = hairColor;
    }

    void display(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Hair Color = "+hairColor);
    }
}
