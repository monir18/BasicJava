import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        /*
        valid voter program using if,else
        step 1: ask for a person age
        step 2: if age is equal or more than 18 than print valid voter
        step 3: else print invalid voter
         */
        int age;
        Scanner inputAge = new Scanner(System.in);
        System.out.println("Enter age : ");
        age = inputAge.nextInt();
        if (age >= 18 ){
            System.out.println("Valid Voter");
        }
        else{
            System.out.println("Invalid Voter..");
        }
    }
}
