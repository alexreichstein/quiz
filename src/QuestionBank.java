import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionBank {
    private List<Question> questions = new ArrayList<>();

    public QuestionBank() {
        loadQuestions();
    }

    private void loadQuestions() {
        // ==================== NIVÅ 1 ====================

        // SPORT - Nivå 1
        questions.add(new Question(
                "Vilken svensk fotbollsklubb har störst publik i snitt?",
                new String[]{"Djurgårdens IF", "Hammarby IF", "AIK", "IFK Göteborg"},
                2, // AIK
                "Sport",
                1
        ));

        questions.add(new Question(
                "I vilken stad spelar AIK sina hemmamatcher i fotboll?",
                new String[]{"Malmö", "Stockholm", "Uppsala", "Göteborg"},
                1, // Stockholm
                "Sport",
                1
        ));

        questions.add(new Question(
                "Hur många spelare har ett lag på planen i fotboll (utan avbytare)?",
                new String[]{"9", "10", "11", "12"},
                2, // 11
                "Sport",
                1
        ));

        questions.add(new Question(
                "Vilken sport förknippas med turneringen Wimbledon?",
                new String[]{"Tennis", "Golf", "Basket", "Handboll"},
                0, // Tennis
                "Sport",
                1
        ));

        // FILMER - Nivå 1
        questions.add(new Question(
                "Vem regisserade filmen \"Inception\"?",
                new String[]{"Christopher Nolan", "Steven Spielberg", "James Cameron", "Quentin Tarantino"},
                0, // Christopher Nolan
                "Filmer",
                1
        ));

        questions.add(new Question(
                "Vilket år släpptes den första filmen i serien \"The Matrix\"?",
                new String[]{"1995", "1997", "1999", "2001"},
                2, // 1999
                "Filmer",
                1
        ));

        questions.add(new Question(
                "Vilken filmserie innehåller karaktären Jack Sparrow?",
                new String[]{"Harry Potter", "Pirates of the Caribbean", "Star Wars", "Fast & Furious"},
                1, // Pirates of the Caribbean
                "Filmer",
                1
        ));

        questions.add(new Question(
                "I vilken superhjältefilm är Tony Stark huvudkaraktär?",
                new String[]{"Batman", "Spider-Man", "Iron Man", "Superman"},
                2, // Iron Man
                "Filmer",
                1
        ));

        // MUSIK - Nivå 1
        questions.add(new Question(
                "Vilket svenskt band gjorde låten \"Dancing Queen\"?",
                new String[]{"ABBA", "Roxette", "Europe", "Ace of Base"},
                0, // ABBA
                "Musik",
                1
        ));

        questions.add(new Question(
                "Vilket instrument har normalt 88 tangenter?",
                new String[]{"Gitarr", "Trummor", "Piano", "Fiol"},
                2, // Piano
                "Musik",
                1
        ));

        questions.add(new Question(
                "Vilken musikgenre förknippas mest med artisten Eminem?",
                new String[]{"Rock", "Pop", "Rap", "Jazz"},
                2, // Rap
                "Musik",
                1
        ));

        questions.add(new Question(
                "Från vilket land kommer DJ:n Avicii?",
                new String[]{"Norge", "Sverige", "Danmark", "Finland"},
                1, // Sverige
                "Musik",
                1
        ));

        // SERIER - Nivå 1
        questions.add(new Question(
                "I vilken stad utspelar sig större delen av TV-serien \"Friends\"?",
                new String[]{"Los Angeles", "Chicago", "New York", "Boston"},
                2, // New York
                "Serier",
                1
        ));

        questions.add(new Question(
                "Vad heter familjen i serien \"The Simpsons\" i efternamn?",
                new String[]{"Griffin", "Simpson", "Smith", "Brown"},
                1, // Simpson
                "Serier",
                1
        ));

        questions.add(new Question(
                "Vilken TV-serie innehåller karaktären Walter White?",
                new String[]{"Breaking Bad", "The Office", "Game of Thrones", "Lost"},
                0, // Breaking Bad
                "Serier",
                1
        ));

        questions.add(new Question(
                "Vilken streamingtjänst släppte serien \"Stranger Things\"?",
                new String[]{"Disney+", "Netflix", "HBO Max", "Amazon Prime Video"},
                1, // Netflix
                "Serier",
                1
        ));

        // ==================== NIVÅ 2 ====================

        // SPORT - Nivå 2
        questions.add(new Question(
                "Vilket land vann fotbolls-VM för herrar 2018?",
                new String[]{"Tyskland", "Brasilien", "Frankrike", "Argentina"},
                2, // Frankrike
                "Sport",
                2
        ));

        questions.add(new Question(
                "Hur lång är en hel maraton, avrundat till en decimal?",
                new String[]{"21,1 km", "30,0 km", "35,0 km", "42,2 km"},
                3, // 42,2 km
                "Sport",
                2
        ));

        questions.add(new Question(
                "Vilken svensk skidlegend kallas \"Gunde\" i förnamn?",
                new String[]{"Gunde Svan", "Thomas Wassberg", "Per Elofsson", "Lars-Åke Nordh"},
                0, // Gunde Svan
                "Sport",
                2
        ));

        questions.add(new Question(
                "I vilken sport används en puck?",
                new String[]{"Handboll", "Ishockey", "Bandy", "Baseboll"},
                1, // Ishockey
                "Sport",
                2
        ));

        // FILMER - Nivå 2
        questions.add(new Question(
                "Vilken film vann Oscar för bästa film år 2020?",
                new String[]{"Joker", "1917", "Once Upon a Time in Hollywood", "Parasite"},
                3, // Parasite
                "Filmer",
                2
        ));

        questions.add(new Question(
                "Vilken skådespelare spelar Neo i \"The Matrix\"-filmerna?",
                new String[]{"Keanu Reeves", "Brad Pitt", "Tom Cruise", "Leonardo DiCaprio"},
                0, // Keanu Reeves
                "Filmer",
                2
        ));

        questions.add(new Question(
                "I vilken animerad film är Elsa en av huvudkaraktärerna?",
                new String[]{"Frost (Frozen)", "Moana", "Lejonkungen", "Toy Story"},
                0, // Frost
                "Filmer",
                2
        ));

        questions.add(new Question(
                "Vilken regissör ligger bakom filmer som \"Pulp Fiction\" och \"Kill Bill\"?",
                new String[]{"Martin Scorsese", "Quentin Tarantino", "Ridley Scott", "Tim Burton"},
                1, // Quentin Tarantino
                "Filmer",
                2
        ));

        // MUSIK - Nivå 2
        questions.add(new Question(
                "Vilken svensk artist vann Eurovision Song Contest 2015 med låten \"Heroes\"?",
                new String[]{"Måns Zelmerlöw", "Eric Saade", "Loreen", "Carola"},
                0, // Måns Zelmerlöw
                "Musik",
                2
        ));

        questions.add(new Question(
                "Vilket av följande band är främst känt som ett rockband?",
                new String[]{"ABBA", "Metallica", "Avicii", "Daft Punk"},
                1, // Metallica
                "Musik",
                2
        ));

        questions.add(new Question(
                "Från vilket land kommer musikgenren K-pop ursprungligen?",
                new String[]{"Japan", "Kina", "Sydkorea", "Thailand"},
                2, // Sydkorea
                "Musik",
                2
        ));

        questions.add(new Question(
                "Vilken artist är känd för albumet \"Thriller\"?",
                new String[]{"Prince", "Michael Jackson", "Stevie Wonder", "Elton John"},
                1, // Michael Jackson
                "Musik",
                2
        ));

        // SERIER - Nivå 2
        questions.add(new Question(
                "I vilken serie följer vi bland annat familjerna Stark, Lannister och Targaryen?",
                new String[]{"Vikings", "Game of Thrones", "The Witcher", "The Crown"},
                1, // Game of Thrones
                "Serier",
                2
        ));

        questions.add(new Question(
                "Vad heter den fiktiva småstaden där \"Stranger Things\" utspelar sig?",
                new String[]{"Hawkins", "Springfield", "Riverdale", "Hill Valley"},
                0, // Hawkins
                "Serier",
                2
        ));

        questions.add(new Question(
                "Vilken serie utspelar sig på ett kvinnofängelse och började på Netflix?",
                new String[]{"Orange Is the New Black", "Prison Break", "Wentworth", "Oz"},
                0, // Orange Is the New Black
                "Serier",
                2
        ));

        // ==================== NIVÅ 3 ====================

        // SPORT - Nivå 3
        questions.add(new Question(
                "Vilket år tog Sverige brons i fotbolls-VM för herrar senast?",
                new String[]{"1950", "1958", "1974", "1994"},
                3, // 1994
                "Sport",
                3
        ));

        questions.add(new Question(
                "Vilken svensk friidrottare vann OS-guld i höjdhopp 2004?",
                new String[]{"Stefan Holm", "Patrik Sjöberg", "Kajsa Bergqvist", "Christian Olsson"},
                0, // Stefan Holm
                "Sport",
                3
        ));

        questions.add(new Question(
                "Vilket lag vann Champions League säsongen 2018/2019?",
                new String[]{"Barcelona", "Liverpool", "Real Madrid", "Bayern München"},
                1, // Liverpool
                "Sport",
                3
        ));

        questions.add(new Question(
                "Hur många titlar har Rafael Nadal vunnit i Franska öppna (Roland Garros) fram till och med 2023?",
                new String[]{"11", "13", "14", "16"},
                2, // 14
                "Sport",
                3
        ));

        // FILMER - Nivå 3
        questions.add(new Question(
                "Vilka av följande filmer har vunnit 11 Oscars vardera?",
                new String[]{
                        "Endast \"Titanic\"",
                        "Endast \"Ben-Hur\"",
                        "Endast \"Sagan om konungens återkomst\"",
                        "\"Titanic\", \"Ben-Hur\" och \"Sagan om konungens återkomst\""
                },
                3, // Alla tre
                "Filmer",
                3
        ));

        questions.add(new Question(
                "Vem spelade Jokern i filmen \"The Dark Knight\" från 2008?",
                new String[]{"Joaquin Phoenix", "Heath Ledger", "Jack Nicholson", "Jared Leto"},
                1, // Heath Ledger
                "Filmer",
                3
        ));

        questions.add(new Question(
                "Vilken film av Stanley Kubrick från 1980 bygger på en roman av Stephen King?",
                new String[]{"The Shining", "Carrie", "Misery", "It"},
                0, // The Shining
                "Filmer",
                3
        ));

        questions.add(new Question(
                "Vilket år hade originalfilmen \"Blade Runner\" premiär?",
                new String[]{"1979", "1982", "1985", "1987"},
                1, // 1982
                "Filmer",
                3
        ));

        // MUSIK - Nivå 3
        questions.add(new Question(
                "Vilket band släppte albumet \"The Dark Side of the Moon\" 1973?",
                new String[]{"Led Zeppelin", "Pink Floyd", "The Beatles", "Queen"},
                1, // Pink Floyd
                "Musik",
                3
        ));

        questions.add(new Question(
                "Vem vann Eurovision Song Contest för Sverige 2012 med låten \"Euphoria\"?",
                new String[]{"Carola", "Loreen", "Måns Zelmerlöw", "Charlotte Perrelli"},
                1, // Loreen
                "Musik",
                3
        ));

        questions.add(new Question(
                "Vilket år avled artisten Prince?",
                new String[]{"2014", "2015", "2016", "2017"},
                2, // 2016
                "Musik",
                3
        ));

        questions.add(new Question(
                "Vilket band hade stora hits med låtarna \"Bohemian Rhapsody\" och \"We Will Rock You\"?",
                new String[]{"The Rolling Stones", "Queen", "AC/DC", "Aerosmith"},
                1, // Queen
                "Musik",
                3
        ));

        // SERIER - Nivå 3
        questions.add(new Question(
                "Hur många säsonger har TV-serien \"Breaking Bad\"?",
                new String[]{"4", "5", "6", "7"},
                1, // 5
                "Serier",
                3
        ));

        questions.add(new Question(
                "Vad heter kaféet där vännerna ofta träffas i \"Friends\"?",
                new String[]{"Central Perk", "Coffee House", "The Daily Grind", "Java Joe's"},
                0, // Central Perk
                "Serier",
                3
        ));

        questions.add(new Question(
                "Vilken skådespelare spelar Sherlock Holmes i BBC-serien \"Sherlock\"?",
                new String[]{"Martin Freeman", "Benedict Cumberbatch", "Robert Downey Jr.", "Jonny Lee Miller"},
                1, // Benedict Cumberbatch
                "Serier",
                3
        ));
    }

    public List<Question> getAllQuestions() {
        return questions;
    }

    public List<Question> getRandomQuestions() {
        List<Question> shuffled = new ArrayList<>(questions);
        Collections.shuffle(shuffled);
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

    public List<Question> getQuestionsByLevel(int level) {
        List<Question> filtered = new ArrayList<>();
        for (Question q : questions) {
            if (q.getLevel() == level) {
                filtered.add(q);
            }
        }
        return filtered;
    }

    public List<Question> getRandomQuestionsByLevel(int level, int count) {
        List<Question> filtered = new ArrayList<>();
        for (Question q : questions) {
            if (q.getLevel() == level) {
                filtered.add(q);
            }
        }
        Collections.shuffle(filtered);
        if (filtered.size() > count) {
            return filtered.subList(0, count);
        }
        return filtered;
    }

    public List<Question> getRandomQuestionsByCategoryAndLevel(String category, int level, int count) {
        List<Question> filtered = new ArrayList<>();
        for (Question q : questions) {
            if (q.getCategory().equalsIgnoreCase(category) && q.getLevel() == level) {
                filtered.add(q);
            }
        }
        Collections.shuffle(filtered);
        if (filtered.size() > count) {
            return filtered.subList(0, count);
        }
        return filtered;
    }
}