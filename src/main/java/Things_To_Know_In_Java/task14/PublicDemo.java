package Things_To_Know_In_Java.task14;


class Class1 {
    public void class1Method() {
        System.out.println("This is a public method.");
    }
}
class Class2 {
    public void class2Method() {
        Class1 class1 = new Class1();
        class1.class1Method();
    }
}

public class PublicDemo {
    public static void main(String[] args) {
        Class2 class2 = new Class2();
        class2.class2Method();
    }

}
