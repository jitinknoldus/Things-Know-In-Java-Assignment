package Things_To_Know_In_Java.task10;

//importing shapes package
import Things_To_Know_In_Java.Shapes.Circle;
import Things_To_Know_In_Java.Shapes.Rectangle;
import Things_To_Know_In_Java.Shapes.Triangle;

import java.util.Scanner;

public class ShapesOperations {

    public static void main(String[] args) {

        Circle circleObject = new Circle(10);
        System.out.println("Circle Area: "+circleObject.getArea());
        System.out.println("Circle Perimeter: "+circleObject.getPerimeter());

        Rectangle rectangleObject = new Rectangle(10,4);
        System.out.println("\nRectangle Area: "+rectangleObject.getArea());
        System.out.println("Rectangle Perimeter: "+rectangleObject.getPerimeter());

        Triangle triangleObject = new Triangle(10,6,7);
        System.out.println("\nTriangle Area: "+triangleObject.getArea());
        System.out.println("Triangle Perimeter: "+triangleObject.getPerimeter());

    }

}
