package Things_To_Know_In_Java.task8;

import java.util.Scanner;

public class ExponentialFunction {
    public static double E = 2.71828;

    public  double calculateExponential(double x) {
        double result = Math.exp(x);
        return result;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("enter the value");
        int value = scannerObject.nextInt();

        ExponentialFunction object1 = new ExponentialFunction();

        double exponentialValue = object1.calculateExponential(value);
        System.out.println("Exponential value: " + exponentialValue);
    }
}
