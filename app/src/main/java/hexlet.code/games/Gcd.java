package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    public static final int MAX_NUMBER_VALUE = 50;

    public static void game() {
        var condition = "Find the greatest common divisor of given numbers.";
        Random random = new Random();
        var numberOfLevels = Engine.NUMBER_OF_LEVELS;
        String[][] gameData = new String[numberOfLevels][2];

        for (var i = 0; i < numberOfLevels; i++) {
            var firstNum = random.nextInt(MAX_NUMBER_VALUE) + 1;
            var secondNum = random.nextInt(MAX_NUMBER_VALUE) + 1;
            var greatesCommon = 0;
            for (var common = 1; common < firstNum + secondNum; common++) {
                if (firstNum % common == 0 && secondNum % common == 0) {
                    greatesCommon = common;
                }
            }
            gameData[i][0] = firstNum + " " + secondNum;
            gameData[i][1] = Integer.toString(greatesCommon);
        }
        System.out.println(Engine.source(condition, gameData));
    }
}
