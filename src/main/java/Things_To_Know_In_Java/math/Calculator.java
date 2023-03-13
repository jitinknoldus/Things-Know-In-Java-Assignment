package Things_To_Know_In_Java.math;

public class Calculator {
    public  int add(int a, int b) {
        return a + b;
    }

    public  int subtract(int a, int b) {
        return a - b;
    }

    public  int multiply(int a, int b) {
        return a * b;
    }

    public  int divide(int a, int b) {
        try{
            return a / b;
        }
        catch(ArithmeticException e){
            System.out.println("Invalid Operation");
        }
        return 0;
    }

}
