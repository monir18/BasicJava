public class StaticMethodRestrictions {
    int x = 10;
    void display1(){
        display2();
        System.out.println(x);
        System.out.println("I am non static method");
        System.out.println();
    }

    static void display2(){
        //display1(); // does not work
        //System.out.println(x);
        System.out.println("I am static method");
    }
}
