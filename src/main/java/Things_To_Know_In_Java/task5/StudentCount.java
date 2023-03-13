package Things_To_Know_In_Java.task5;

public class StudentCount {

    private static int uniqueId = 1001;
    private int id;
    private static int numOfStudents;

    public StudentCount() {
        this.id = uniqueId;
        numOfStudents++;
        uniqueId++;
    }

    public  int getNumOfStudents() {
        return numOfStudents;
    }

    public int getId(){
        return id;
    }

}

class Main{

    public static void main(String[] args) {
        StudentCount student1 = new StudentCount();             //for student 1
        System.out.println("Student 1 Details");
        System.out.println("Student ID: "+student1.getId());
        System.out.println("Total Number of Students:  "+student1.getNumOfStudents());


        StudentCount student2 = new StudentCount();             //for student2
        System.out.println("\nStudent 2 Details");
        System.out.println("Student ID: "+student2.getId());
        System.out.println("Total Number of Students:  "+student2.getNumOfStudents());


    }


}