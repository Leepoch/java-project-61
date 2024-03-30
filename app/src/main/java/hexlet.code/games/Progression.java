package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.StringJoiner;

public class Progression {
    public static final int MAX_PROGRESSION_SIZE = 6;
    public static final int MIN_PROGRESSION_SIZE = 5;
    public static final int MAX_STEP_PROGRESSION = 10;
    public static final int MIN_STEP_PROGRESSION = 1;
    public static final int MAX_ITEM_PROGRESSION = 21;

    public static String getProgression(int progressionSize, int stepProgression, int itemProgression) {
        StringJoiner stringProgression = new StringJoiner(" ");
        for (var index = 0; index < progressionSize; index++) {
            stringProgression.add(Integer.toString(itemProgression));
            itemProgression += stepProgression;
        }
        return stringProgression.toString();
    }
    public static String[][] prepareData() {
        var numberOfLevels = Engine.NUMBER_OF_LEVELS;
        String[][] gameData = new String[numberOfLevels][2];

        for (var i = 0; i < numberOfLevels; i++) {
            var progressionSize = Utils.getRandomNum(MAX_PROGRESSION_SIZE, MIN_PROGRESSION_SIZE);
            var indexMissingNumber = Utils.getRandomNum(progressionSize - 1);
            var stepProgression = Utils.getRandomNum(MAX_STEP_PROGRESSION, MIN_STEP_PROGRESSION);
            var itemProgression = Utils.getRandomNum(MAX_ITEM_PROGRESSION);
            var progression = getProgression(progressionSize, stepProgression, itemProgression);
            var progressionInArray = progression.split(" ");
            var missingNumber = progressionInArray[indexMissingNumber];
            progressionInArray[indexMissingNumber] = "..";
            gameData[i][0] = String.join(" ", progressionInArray);
            gameData[i][1] = missingNumber;
        }
        return gameData;
    }
    public static void game() {
        var condition = "What number is missing in the progression?";
        System.out.println(Engine.source(condition, prepareData()));
    }
}
