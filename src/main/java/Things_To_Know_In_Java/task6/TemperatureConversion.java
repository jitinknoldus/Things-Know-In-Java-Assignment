package Things_To_Know_In_Java.task6;

import java.util.Scanner;

public class TemperatureConversion {

    private static double CONVERSION_FACTOR = 1.8;

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * CONVERSION_FACTOR) + 32;
        return fahrenheit;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TemperatureConversion object1 = new TemperatureConversion();
        System.out.println("Enter the temperature in celsius");
        int celsius = input.nextInt();
        double fahrenheit = object1.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }
}
