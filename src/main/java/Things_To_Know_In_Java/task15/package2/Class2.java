package Things_To_Know_In_Java.task15.package2;

import Things_To_Know_In_Java.task15.package1.Class1;

public class Class2 {
    public void myMethod() {
        Class1 object1 = new Class1();
        int value = object1.myDefaultVariable;
        System.out.println("The value is: " + value);
    }
}

class Main{
    public static void main(String[] args) {
        Class2 object1 = new Class2();
        object1.myMethod();
    }
}


//On running the program it gives the compile time error:
//myDefaultVariable is not public in "Things_To_Know_In_Java.task15.package1.Class1;"
// --cannot be accessed from outside package