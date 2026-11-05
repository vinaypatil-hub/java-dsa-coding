import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "Which language are we learning?",
            "What is 10 + 20?",
            "Which keyword creates an object?",
            "Which loop repeats while a condition is true?",
            "Which symbol checks equality?"
        };

        String[] answers = {
            "Java",
            "30",
            "new",
            "while",
            "=="
        };

        int score = 0;

        System.out.println("===== JAVA QUIZ GAME =====");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\nQ" + (i + 1) + ": " + questions[i]);

            System.out.print("Your answer: ");
            String userAnswer = sc.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct answer!");
                score++;
            } else {
                System.out.println("Wrong answer!");
                System.out.println("Correct answer: " + answers[i]);
            }
        }

        System.out.println("\n===== GAME OVER =====");
        System.out.println("Your score: " + score + "/5");

        double percentage = (score / 5.0) * 100;
        

        System.out.println("Percentage: " + percentage + "%");

        if (score == 5) {            
            System.out.println("Excellent performance!");
        } else if (score >= 3) {
            System.out.println("Good job!");
        } else {
            System.out.println("Keep practising!");
        }

        sc.close();
    }
}
