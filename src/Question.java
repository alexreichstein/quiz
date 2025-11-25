public class Question {
    private final String questionText;
    private final String[] options;
    private final int correctAnswerIndex; // 0–3
    private final String category;        // t.ex. "Sport", "Film"

    public Question(String questionText, String[] options, int correctAnswerIndex, String category) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
        this.category = category;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public String getCategory() {
        return category;
    }

    public boolean isCorrect(int answerIndex) {
        return answerIndex == correctAnswerIndex;
    }
}