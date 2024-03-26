package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final int MAX_NUMBER_VALUE = 21;

    public static String gameData(int question) {
        return question % 2 == 0 ? "yes" : "no";
    }
    public static String[][] prepareData() {
        var numberOfLevels = Engine.NUMBER_OF_LEVELS;
        String[][] gameData = new String[numberOfLevels][2];

        for (var i = 0; i < numberOfLevels; i++) {
            var question = Utils.getRandomNum(MAX_NUMBER_VALUE);
            String correctAnswer = gameData(question);
            gameData[i][0] = Integer.toString(question);
            gameData[i][1] = correctAnswer;
        }
        return gameData;
    }
    public static void game() {
        var condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        System.out.println(Engine.source(condition, prepareData()));
    }
}
