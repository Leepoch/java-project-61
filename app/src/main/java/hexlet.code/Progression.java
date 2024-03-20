package hexlet.code;

import java.util.Random;
import java.util.StringJoiner;

public class Progression {
    public static String game() {
        var condition = "What number is missing in the progression?";
        Random random = new Random();
        String[][] gameData = new String[3][2];

        for (var i = 0; i < 3; i++) {
            var progressionSize = random.nextInt(6) + 5;
            var indexMissingNumber = random.nextInt(progressionSize) - 1;
            var stepProgression = random.nextInt(10) + 1;
            var itemProgression = random.nextInt(21);
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
