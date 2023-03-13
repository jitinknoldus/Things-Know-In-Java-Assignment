package Things_To_Know_In_Java.task11;
import Things_To_Know_In_Java.Game.Player;

public class PlayerDemo {
    public static void main(String[] args) {
        Player player1 = new Player("Jack", 120, 3);
        Player player2 = new Player("John", 150, 5);

        System.out.println("Player 1:");
        System.out.println("Name: " + player1.getName());
        System.out.println("Score: " + player1.getScore());
        System.out.println("Level: " + player1.getLevel());
        System.out.println();

        System.out.println("Player 2:");
        System.out.println("Name: " + player2.getName());
        System.out.println("Score: " + player2.getScore());
        System.out.println("Level: " + player2.getLevel());
        System.out.println();

        player1.setScore(900);
        player2.setLevel(15);

        System.out.println("Player 1:");
        System.out.println("Name: " + player1.getName());
        System.out.println("Score: " + player1.getScore());
        System.out.println("Level: " + player1.getLevel());
        System.out.println();

        System.out.println("Player 2:");
        System.out.println("Name: " + player2.getName());
        System.out.println("Score: " + player2.getScore());
        System.out.println("Level: " + player2.getLevel());
        System.out.println();

    }
}
