import java.util.Scanner;

public class CheckingVowelConsonant {
    public static void main(String[] args) {
        char c;
        Scanner inputCharacter = new Scanner(System.in);
        System.out.print("Enter any letter : ");
        c = inputCharacter.next().charAt(0);

        if (c == 'A'){
            System.out.println("Vowel");
        } else if (c == 'E') {
            System.out.println("Vowel");
        } else if (c == 'I') {
            System.out.println("Vowel");
        } else if (c == 'O') {
            System.out.println("Vowel");
        } else if (c == 'U') {
            System.out.println("Vowel");
        } else if (c == 'a') {
            System.out.println("Vowel");
        } else if (c == 'e') {
            System.out.println("Vowel");
        } else if (c == 'i') {
            System.out.println("Vowel");
        } else if (c == 'o') {
            System.out.println("Vowel");
        } else if (c == 'u') {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
}
