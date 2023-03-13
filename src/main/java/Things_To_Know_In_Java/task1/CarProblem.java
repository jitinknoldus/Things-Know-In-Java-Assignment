package Things_To_Know_In_Java.task1;

public class CarProblem {

    // Static variable to count the number of cars
    private static int numOfCars = 0;

    public CarProblem() {
        numOfCars++;
    }

    public static int getNumOfCars() {
        return numOfCars;
    }

}
    class Main{
    public static void main(String[] args) {
        CarProblem object1 = new CarProblem();
        System.out.println(object1.getNumOfCars());

        CarProblem object2 = new CarProblem();
        System.out.println(object1.getNumOfCars());

    }


}
