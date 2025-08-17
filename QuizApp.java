import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // List of Questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(
                "Which loop is used when number of iterations is known?",
                Arrays.asList("while", "do-while", "for", "foreach"),
                2
        ));
        questions.add(new Question(
                "Which collection class allows dynamic arrays in Java?",
                Arrays.asList("Array", "ArrayList", "HashMap", "Set"),
                1
        ));
        questions.add(new Question(
                "Which statement is faster for multiple conditions?",
                Arrays.asList("if-else", "switch-case", "ternary", "goto"),
                1
        ));

        int score = 0;

        System.out.println("===== Welcome to Java Quiz =====");
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQ" + (i + 1) + ": " + q.getQuestionText());

            List<String> opts = q.getOptions();
            for (int j = 0; j < opts.size(); j++) {
                System.out.println((j + 1) + ". " + opts.get(j));
            }

            System.out.print("Enter your choice (1-" + opts.size() + "): ");
            int answer = sc.nextInt() - 1;

            if (q.isCorrect(answer)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong!");
            }
        }

        System.out.println("\n===== Quiz Finished =====");
        System.out.println("Your Score: " + score + "/" + questions.size());

        sc.close();
    }
}
