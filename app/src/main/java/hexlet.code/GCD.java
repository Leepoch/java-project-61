package hexlet.code;

import java.util.Random;

public class GCD {
    public static String game() {
        var condition = "Find the greatest common divisor of given numbers.";
        Random random = new Random();
        String[][] gameData = new String[3][2];

        for (var i = 0; i < 3; i++) {
            var firstNum = random.nextInt(50) + 1;
            var secondNum = random.nextInt(50) + 1;
            var greatesCommon = 0;
            for (var common = 1; common < firstNum + secondNum; common++) {
                if (firstNum % common == 0 && secondNum % common == 0) {
                    greatesCommon = common;
                }
            }
            gameData[i][0] = firstNum + " " + secondNum;
            gameData[i][1] = Integer.toString(greatesCommon);
        }
        return Engine.source(condition, gameData);
    }
}
