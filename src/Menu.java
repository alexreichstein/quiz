import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    ScoreManager scoreManager = new ScoreManager();

    private Player player;

    public void start() {

        while (true) {
            System.out.println("Welcome to Quiz\n" +
                    "1. New Player\n" +
                    "2. New Game\n" +
                    "3. High score\n" +
                    "4. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createNewPlayer();
                    break;
                case 2:
                    startNewGame();
                    break;
                case 3:
                    showHighScores();
                    break;
                case 4:
                    System.out.println("Good Bye!");
                    return;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    private void showHighScores() {
        System.out.println("\n--- High Scores ---");
        List<Player> scores = scoreManager.getHighScores();
        if (scores.isEmpty()) {
            System.out.println("No scores yet!");
        } else {
            int rank = 1;
            for (Player p : scores) {
                System.out.println(rank + ". " + p.getName() + " - " + p.getScore() + "p");
                rank++;
            }
        }
        System.out.println("-------------------\n");
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


                    player.setScore(score);
                    scoreManager.saveScore(player);
                    return;
                }

            } else {
                System.out.println("Wrong!");
                System.out.println("Correct answer:" + options[q.getCorrectAnswerIndex()]);
            }
        }

        System.out.println("\nQuiz finished!");
        System.out.println("Score: " + score + "/" + questions.size());

        player.setScore(score);
        scoreManager.saveScore(player);
    }
}


