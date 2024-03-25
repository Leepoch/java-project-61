package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.StringJoiner;

public class Progression {
    public static final int MAX_PROGRESSION_SIZE = 6;
    public static final int MIN_PROGRESSION_SIZE = 5;
    public static final int MAX_STEP_PROGRESSION = 10;
    public static final int MAX_ITEM_PROGRESSION = 21;

    public static void game() {
        var condition = "What number is missing in the progression?";
        var numberOfLevels = Engine.NUMBER_OF_LEVELS;
        String[][] gameData = new String[numberOfLevels][2];

        for (var i = 0; i < numberOfLevels; i++) {
            var progressionSize = Utils.getRandomNum(MAX_PROGRESSION_SIZE, MIN_PROGRESSION_SIZE);
            var indexMissingNumber = Utils.getRandomNum(progressionSize);
            var stepProgression = Utils.getRandomNum(MAX_STEP_PROGRESSION) + 1;
            var itemProgression = Utils.getRandomNum(MAX_ITEM_PROGRESSION);
            var missingNumber = 0;
            StringJoiner stringProgression = new StringJoiner(" ");
            for (var index = 0; index < progressionSize; index++) {
                if (index == indexMissingNumber) {
                    stringProgression.add("..");
                    missingNumber = itemProgression;
                } else {
                    stringProgression.add(Integer.toString(itemProgression));
                }
                itemProgression += stepProgression;
            }
            gameData[i][0] = stringProgression.toString();
            gameData[i][1] = Integer.toString(missingNumber);
        }
        System.out.println(Engine.source(condition, gameData));
    }
}
