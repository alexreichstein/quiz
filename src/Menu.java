import java.util.List;
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
        player = new Player(name, 0);
        System.out.println("Player created " + player.getName());

    }

    private void startNewGame() {
        if (player == null) {
            System.out.println("You must create a player first!");
            return;
        }

        System.out.println("Starting Quiz-Game! " + player.getName());

        List<Question> questions = new QuestionBank().getRandomQuestions();
        int score = 0;

        for (Question q : questions) {
            System.out.println("\n" + q.getQuestionText());

            String[] options = q.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            System.out.print("Enter your answer: ");
            int answer = scanner.nextInt();
            scanner.nextLine();

            if (q.isCorrect(answer - 1)) {
                System.out.println("Correct!");
                score++;

            if (score >= 10) {
                System.out.println("You´ve reached 10 points! Good job!\n Game completed!");
                return;
            }

            } else {
                System.out.println("Wrong!");
                System.out.println("Correct answer:" + options[q.getCorrectAnswerIndex()]);
            }
        }
        System.out.println("\nQuiz finished!");
        System.out.println("Score: " + score + "/" + questions.size());
    }

}


