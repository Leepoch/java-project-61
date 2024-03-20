package hexlet.code;

import java.util.Random;

public class Calc {
    public static String gameCalc() {
        var condition = "What is the result of the expression?";
        Random random = new Random();
        String[][] gameData = new String[3][2];

        for (var i = 0; i < 3; i++) {
            var indexOperator = random.nextInt(3);
            var firstOperand = random.nextInt(21);
            var secondOperand = random.nextInt(21);
            switch (indexOperator) {
                case 0:
                    gameData[i][1] = Integer.toString(firstOperand + secondOperand);
                    gameData[i][0] = firstOperand + "+" + secondOperand;
                    break;
                case 1:
                    gameData[i][1] = Integer.toString(firstOperand - secondOperand);
                    gameData[i][0] = firstOperand + "-" + secondOperand;
                    break;
                case 2:
                    gameData[i][1] = Integer.toString(firstOperand * secondOperand);
                    gameData[i][0] = firstOperand + "*" + secondOperand;
            }
        }
        return Engine.source(condition, gameData);
    }
}
