package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String source(String condition, String[][] gameData) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        var name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(condition);
        for (var item : gameData) {
            var question = item[0];
            var correctAnswer = item[1];
            System.out.println("Question: " + question);
            var answer = scanner.nextLine();
            if (correctAnswer.equals(answer)) {
                System.out.println("Correct!");
            } else {
                return "'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.\nLet's try again, " + name + "!";
            }
        }
        return "Congratulations, " + name + "!";
    }
}
