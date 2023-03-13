package Things_To_Know_In_Java.task2;

public class CircumferenceOfCircle {

    public static final double PI = 3.14159;

    public static double getCircumference(double radius) {
        double circumference = 2 * PI * radius;
        return circumference;
    }

}
    class Main{
    public static void main(String[]args) {
        CircumferenceOfCircle object1 = new CircumferenceOfCircle();
        double radius = 5.0;
        double circumference = object1.getCircumference(radius);
        System.out.println("Circumference = " + circumference);
    }

}
