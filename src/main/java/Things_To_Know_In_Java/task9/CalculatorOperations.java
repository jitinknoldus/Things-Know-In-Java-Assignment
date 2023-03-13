package Things_To_Know_In_Java.task9;

//importing math package
import Things_To_Know_In_Java.math.Calculator;

import java.util.Scanner;

public class CalculatorOperations {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int userInput1 = scannerObject.nextInt();

        System.out.println("Enter 2nd number");
        int userInput2 = scannerObject.nextInt();

        Calculator object1 = new Calculator();
        System.out.println("Addition: " + object1.add(userInput1,userInput2));
        System.out.println("Subtraction: " + object1.subtract(userInput1,userInput2));
        System.out.println("Multiplication: " + object1.multiply(userInput1,userInput2));
        System.out.println("Division: " + object1.divide(userInput1,userInput2));
    }
}
