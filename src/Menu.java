import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    private Player player;

    public void start() {

        while (true) {
            System.out.println("Welcome to Quiz\n" +
                    "1. New Game\n" +
                    "2. New Player\n" +
                    "3. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    startNewGame();
                    break;
                case 2:
                    createNewPlayer();
                    break;
                case 3:
                    System.out.println("Good Bye!");
                    return;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    private void createNewPlayer() {
        System.out.println("Enter player name: ");
        String name = scanner.nextLine();
        Player player = new Player(name, 0);
        System.out.println("Player created " + player.getName());

    }

    private void startNewGame() {
        if (player == null) {
            System.out.println("You must create a player first!");
        }
    }
}

