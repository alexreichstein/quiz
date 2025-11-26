import java.util.ArrayList;
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

        // Välj nivå
        System.out.println("\nChoose difficulty level:");
        System.out.println("1. Level 1 (Easy)");
        System.out.println("2. Level 2 (Medium)");
        System.out.println("3. Level 3 (Hard)");
        System.out.print("Enter your choice: ");

        int levelChoice = scanner.nextInt();
        scanner.nextLine();

        int selectedLevel = 1;
        switch (levelChoice) {

            case 1:
                selectedLevel = 1;
                System.out.println("\n=== Starting Level 1 ===");
                break;

                case 2:
                    selectedLevel = 2;
                    System.out.println("\n=== Starting Level 2 ===");
                    break;

                    case 3:
                        selectedLevel = 3;
                        System.out.println("\n=== Starting Level 3 ===");
                        break;
                        default:
        }


        System.out.println("Player: " + player.getName());

        QuestionBank bank = new QuestionBank();
        List<Question> questions = bank.getRandomQuestionsByLevel(selectedLevel, 15);
        List<Question> wrongAnswers = new ArrayList<>();

        if (questions.isEmpty()) {
            System.out.println("No questions available for this level!");
            return;
        }

        int score = 0;


        for (Question q : questions) {
            System.out.println("\n" + q.getQuestionText());

            String[] options = q.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            System.out.print("Enter your answer (0 to stop): ");
            int answer = scanner.nextInt();
            scanner.nextLine();

            if (answer == 0) {
                System.out.println("Game stopped! ");
                break;
            }

            if (q.isCorrect(answer - 1)) {
                System.out.println("Correct!");
                score++;

                if (score >= 10) {
                    System.out.println("You´ve reached 10 points! Good job!\n Game completed!");

                    showWrongAnswers(wrongAnswers);


                    player.setScore(score);
                    scoreManager.saveScore(player);
                    return;
                }

            } else {
                System.out.println("Wrong!");
                System.out.println("Correct answer:" + options[q.getCorrectAnswerIndex()]);

                wrongAnswers.add(q);
            }
        }

        System.out.println("\nQuiz finished!");
        System.out.println("Score: " + score + "/" + questions.size());

        player.setScore(score);
        scoreManager.saveScore(player);

    }

    private void showWrongAnswers(List<Question> wrongAnswers) {
        if (!wrongAnswers.isEmpty()) {
            System.out.println("\nWrong answers:");
            for (Question q : wrongAnswers) {
                System.out.println("Question" + q.getQuestionText());
                String correctAnswer = q.getOptions()[q.getCorrectAnswerIndex()];
                System.out.println("Correct answer: " + correctAnswer);
            }
        }
    }
}


