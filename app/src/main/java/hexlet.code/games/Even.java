package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static String game(int numberOfLevels) {
        var condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Random random = new Random();
        String[][] gameData = new String[numberOfLevels][2];

        for (var i = 0; i < numberOfLevels; i++) {
            var maxNumberValue = 21;
            var question = random.nextInt(maxNumberValue);
            String correctAnswer = question % 2 == 0 ? "yes" : "no";
            gameData[i][0] = Integer.toString(question);
            gameData[i][1] = correctAnswer;
        }
        return Engine.source(condition, gameData);
    }
}