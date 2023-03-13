package Things_To_Know_In_Java.task4;

public class BankInterest {

    private double balance;
    private static double interestRate = 7.12;

    public BankInterest(double initialBalance)
    {
        balance = initialBalance;
    }
    public double calculateInterest() {
        double interest = balance * (interestRate/100);
        return interest;
    }

}

class Main{
    public static void main(String[] args) {
        BankInterest user1 = new BankInterest(50000.0);
        double interest = user1.calculateInterest();
        System.out.println("Interest earned: (in rupees)" + interest);
    }
}