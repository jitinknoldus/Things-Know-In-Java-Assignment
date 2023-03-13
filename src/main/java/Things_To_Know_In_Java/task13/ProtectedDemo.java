package Things_To_Know_In_Java.task13;

class Parent {
    protected void protectedMethod()
    {

        System.out.println("Printing from protected method");
    }
}
class Child extends Parent {
    public void callProtectedMethod() {
        protectedMethod();
    }
}

public class ProtectedDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.callProtectedMethod();
    }

}
