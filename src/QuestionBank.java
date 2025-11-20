import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionBank {
    private List<Question>  questions = new ArrayList<>();

    public QuestionBank() {
        loadQuestions();
    }

    private void loadQuestions() {
        // SPORT
        questions.add(new Question(
                "Vilken svensk fotbolls klubb har störst publik?",
                new String[]{"Djurgårdens IF", "Hammarby IF", "AIK", "IFK Göteborg"},
                2, // AIK
                "Sport"
        ));

        questions.add(new Question(
                "I vilken stad spelar AIK sina hemmamatcher i fotboll?",
                new String[]{"Malmö", "Stockholm", "Uppsala", "Göteborg"},
                1,
                "Sport"
        ));

        questions.add(new Question(
                "Hur många spelare finns på planen i ett lag i fotboll (exklusive avbytare)?",
                new String[]{"9", "10", "11", "12"},
                2,
                "Sport"
        ));

        questions.add(new Question(
                "Vilken sport förknippas med turneringen Wimbledon?",
                new String[]{"Tennis", "Golf", "Basket", "Handboll"},
                0,
                "Sport"
        ));

        // FILMER
        questions.add(new Question(
                "Vem regisserade filmen \"Inception\"?",
                new String[]{"Christopher Nolan", "Steven Spielberg", "James Cameron", "Quentin Tarantino"},
                0,
                "Filmer"
        ));

        questions.add(new Question(
                "Vilket år släpptes den första \"The Matrix\"-filmen?",
                new String[]{"1995", "1997", "1999", "2001"},
                2,
                "Filmer"
        ));

        questions.add(new Question(
                "Vilken filmserie innehåller karaktären Jack Sparrow?",
                new String[]{"Harry Potter", "Pirates of the Caribbean", "Star Wars", "Fast & Furious"},
                1,
                "Filmer"
        ));

        questions.add(new Question(
                "Vilken superhjältefilm tillhör karaktären Tony Stark?",
                new String[]{"Batman", "Spider-Man", "Iron Man", "Superman"},
                2,
                "Filmer"
        ));

        // MUSIK
        questions.add(new Question(
                "Vilket svenskt band gjorde låten \"Dancing Queen\"?",
                new String[]{"ABBA", "Roxette", "Europe", "Ace of Base"},
                0,
                "Musik"
        ));

        questions.add(new Question(
                "Vilket instrument har 88 tangenter på en standardmodell?",
                new String[]{"Gitarr", "Trummor", "Piano", "Fiol"},
                2,
                "Musik"
        ));

        questions.add(new Question(
                "Vilken genre förknippas mest med artisten Eminem?",
                new String[]{"Rock", "Pop", "Rap", "Jazz"},
                2,
                "Musik"
        ));

        questions.add(new Question(
                "Vilket land kommer DJ:n Avicii ifrån?",
                new String[]{"Norge", "Sverige", "Danmark", "Finland"},
                1,
                "Musik"
        ));

        // SERIER
        questions.add(new Question(
                "I vilken stad utspelar sig stora delar av TV-serien \"Friends\"?",
                new String[]{"Los Angeles", "Chicago", "New York", "Boston"},
                2,
                "Serier"
        ));

        questions.add(new Question(
                "Vad heter den blåa familjen i serien \"The Simpsons\"? (efternamn)",
                new String[]{"Griffin", "Simpson", "Smith", "Brown"},
                1,
                "Serier"
        ));

        questions.add(new Question(
                "Vilken serie innehåller karaktären Walter White?",
                new String[]{"Breaking Bad", "The Office", "Game of Thrones", "Lost"},
                0,
                "Serier"
        ));

        questions.add(new Question(
                "Vilken streamingtjänst släppte serien \"Stranger Things\"?",
                new String[]{"Disney+", "Netflix", "HBO Max", "Amazon Prime"},
                1,
                "Serier"
        ));
    }
    public List<Question> getAllQuestions() {
        return questions;
    }
    /**
     * Retunerar en lista med alla frågor i slumpmässig ordning.
     * Originalfrågelistan i QuestionBank ändras itne.
     * @return en ny lista med frågorn i slumpmässig orning.
     */
    public List<Question> getRandomQuestions() {
        List<Question> shuffled = new ArrayList<>(questions); //skapa en kopia
        Collections.shuffle(shuffled); // Blanda kopian
        return shuffled;
    }
    public List<Question> getQuestionsByCategory(String category) {
        List<Question> filtered = new ArrayList<>();
        for (Question q : questions) {
            if (q.getCategory().equalsIgnoreCase(category)) {
                filtered.add(q);
            }
        }
        return filtered;
    }
}
