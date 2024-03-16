package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static String gameEven() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        var name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (var i = 0; i < 3; i++) {
            var num = random.nextInt(21);
            System.out.println("Question: " + num);
            var answer = scanner.nextLine();
            var correctAnswer = num % 2 == 0 ? "yes" : "no";
            var result = correctAnswer.equals(answer);
            if (result) {
                System.out.println("Correct!");
            } else {
                return "'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.";
            }
        }
        return "Congratulations, " + name + "!";
    }
}
