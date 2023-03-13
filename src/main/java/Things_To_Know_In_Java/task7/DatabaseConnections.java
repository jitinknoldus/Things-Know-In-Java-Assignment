package Things_To_Know_In_Java.task7;

public class DatabaseConnections {
    private static int numOfConnections = 0;
    public  void connect() {
        numOfConnections++;
        System.out.println("Number of active connections: " + numOfConnections);
    }
    public  void closeConnection() {
        numOfConnections--;
        System.out.println("Number of active connections: " + numOfConnections);
    }
}

class Main{
    public static void main(String[] args) {
        DatabaseConnections connection1 = new DatabaseConnections();
        DatabaseConnections connection2 = new DatabaseConnections();
        DatabaseConnections connection3 = new DatabaseConnections();

        connection1.connect();
        connection2.connect();
        connection3.connect();
        connection2.closeConnection();

    }
}
