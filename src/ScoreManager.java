import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ScoreManager {
    private final String fileName = "scores.txt";

    public void saveScore(Player player) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(player.getName() + ":" + player.getScore());
            writer.newLine();
        } catch (Exception e) {
            System.out.println("Kunde inte spara poängen: " + e.getMessage());
        }
    }

    public List<Player> getHighScores() {
        List<Player> highScores = new ArrayList<>();
        File file = new File(fileName);

        if (!file.exists()) {
            return highScores;
        }

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(":");
                    if (parts.length == 2) {
                    String name = parts[0];
                    int score = Integer.parseInt(parts[1]);
                    highScores.add(new Player(name, score));
                    }
                }
            } catch (IOException e) {
                System.out.println("Kunde inte läsa high scores: " + e.getMessage());
            }

            highScores.sort((p1, p2) -> Integer.compare(p2.getScore(), p1.getScore()));
            return highScores;
        }
    }

