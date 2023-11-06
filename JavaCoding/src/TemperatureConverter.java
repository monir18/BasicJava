import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        //Celsius convert Fahrenheit
        Scanner inputCelsius = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.println("Enter Celsius : ");
        celsius = inputCelsius.nextDouble();

        fahrenheit = 1.8 * celsius + 32;
        System.out.println("Fahrenheit = "+fahrenheit);

        //Fahrenheit convert Celsius
        Scanner inputFahrenheit = new Scanner(System.in);
        double fahrenheit2, celsius2;

        System.out.println("Enter Fahrenheit : ");
        fahrenheit2 = inputFahrenheit.nextDouble();

        celsius2 = 0.556*(fahrenheit2-32);
        System.out.println("Celsius : "+celsius2);
    }
}
