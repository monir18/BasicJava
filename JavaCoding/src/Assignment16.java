import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        // validate user based on username and password
        // input username and password until username=="anis" and password=="123456"
        // if username and password does not match print "username/password is incorrect. Please try again"
        // if username and password match print "welcome to the system"
        while (true){
            String baseUserName = "Rudaba", userName;
            String basePsw = "jui", password;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter username = ");
            userName = scanner.nextLine();

            System.out.print("Enter password = ");
            password = scanner.nextLine();

            if (userName.equals(baseUserName) && password.equals(basePsw)){
                System.out.println("Welcome to the system");
                break;
            }
            else {
                System.out.println("username/password is incorrect. Please try again");
            }
        }
    }
}
