import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        /*
        Logical AND assignment
        Check eligible candidate
        Step 1: Ask the candidate have you completed your masters? y/n
        Step 2: Ask the candidate are you fulent in English? y/n
        Step 3: if the candidate has passed masters and also have fluent english skill then print you are eligible to for the job interview
        Step 4: else print Sorry. you are not eligible to for the job interview
         */
        char masters, english;
        Scanner inputMasters = new Scanner(System.in);
        System.out.print("Have you completed your masters? ");
        masters = inputMasters.next().charAt(0);

        Scanner inputEnglish = new Scanner(System.in);
        System.out.println("Are you fluent in English? ");
        english = inputEnglish.next().charAt(0);

        if (masters == 'y' && english == 'y' || masters == 'Y' && english == 'Y'){
            System.out.println("You are eligible to for the job interview.");
        }
        else {
            System.out.println("Sorry! you are not eligible to for the job interview");
        }
    }
}
