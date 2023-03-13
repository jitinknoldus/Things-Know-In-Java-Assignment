package Things_To_Know_In_Java.task3;

public class EmployeeId {

    private static int nextId = 1001;
    private int id;

    public EmployeeId()
    {
        id = nextId;
        nextId++;
    }

    public int getId()
    {
        return id;
    }
}


class Main{
    public static void main(String[] args)
    {
        EmployeeId object1 = new EmployeeId();
        System.out.println(object1.getId());

        EmployeeId object2 = new EmployeeId();
        System.out.println(object2.getId());
    }
}