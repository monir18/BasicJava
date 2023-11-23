import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
        /*
         * Assignment 18 (Print the day name)
         * declare an array of weekdays
         * User will give a day number you have to print the equivalent day name
         *
         * Example 1
         * input-> Enter day number (1-7) : 1
         * output-> Monday
         *
         * Example 2
         * input-> Enter day number (1-7) : 3
         * output-> Wednesday
         */
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday"};
        System.out.print("Enter day number (1-7) : ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        for (int i = 0; i < weekdays.length; i++){
            if (day == i+1){
                System.out.println(weekdays[i]);
                break;
            }
        }
    }
}
