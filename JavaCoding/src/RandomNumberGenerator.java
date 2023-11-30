import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(5,10);
        System.out.println("Random number = "+randomNumber);
    }
}
