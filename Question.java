import java.util.List;

public class Question {
    private String questionText;
    private List<String> options;
    private int correctAnswer; // index of correct option (0-based)

    public Question(String questionText, List<String> options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public boolean isCorrect(int answerIndex) {
        return answerIndex == correctAnswer;
    }
}
