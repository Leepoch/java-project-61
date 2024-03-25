package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static final int MAX_NUMBER_VALUE = 21;

    public static void game(int numberOfLevels) {
        var condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Random random = new Random();
        String[][] gameData = new String[numberOfLevels][2];

        for (var i = 0; i < numberOfLevels; i++) {
            var question = random.nextInt(MAX_NUMBER_VALUE);
            String correctAnswer = question % 2 == 0 ? "yes" : "no";
            gameData[i][0] = Integer.toString(question);
            gameData[i][1] = correctAnswer;
        }
        System.out.println(Engine.source(condition, gameData));
    }
}
