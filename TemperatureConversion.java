
import java.util.Scanner;

class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double result = (celsius * 9.0 / 5.0) + 32;
        int fahrenheit = (int) result;

        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);

        sc.close();
    }
}

