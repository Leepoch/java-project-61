package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.StringJoiner;

public class Progression {
    public static final int maxProgressionSize = 6;
    public static final int minProgressionSize = 5;
    public static final int maxStepProgression = 10;
    public static final int maxItemProgression = 21;

    public static String game(int numberOfLevels) {
        var condition = "What number is missing in the progression?";
        Random random = new Random();
        String[][] gameData = new String[numberOfLevels][2];

        for (var i = 0; i < numberOfLevels; i++) {
            var progressionSize = random.nextInt(maxProgressionSize) + minProgressionSize;
            var indexMissingNumber = random.nextInt(progressionSize);
            var stepProgression = random.nextInt(maxStepProgression) + 1;
            var itemProgression = random.nextInt(maxItemProgression);
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
        return Engine.source(condition, gameData);
    }
}
