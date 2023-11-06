public class TypeCasting {
    public static void main(String[] args) {
        //Widening Casting
        int myInt = 9;
        double myDouble = myInt; //Automatic casting : int to double
        System.out.println("Widening Casting : ");
        System.out.println(myInt);  //Output: 9
        System.out.println(myDouble);   //Output: 9.0

        //Narrowing Casting
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; //Manual Casting : double to int
        System.out.println("Narrowing Casting : ");
        System.out.println(myDouble2); //Output : 9.78
        System.out.println(myInt2); //Output : 9
    }
}
