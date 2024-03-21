package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final int NUMBER_OF_OPERATORS = 3;
    private static final int MAX_NUMBER_VALUE = 21;

    public static String game(int numberOfLevels) {
        var condition = "What is the result of the expression?";
        Random random = new Random();
        String[][] gameData = new String[numberOfLevels][2];

        for (var i = 0; i < numberOfLevels; i++) {
            var indexOperator = random.nextInt(NUMBER_OF_OPERATORS);
            var firstOperand = random.nextInt(MAX_NUMBER_VALUE);
            var secondOperand = random.nextInt(MAX_NUMBER_VALUE);
            switch (indexOperator) {
                case 0:
                    gameData[i][1] = Integer.toString(firstOperand + secondOperand);
                    gameData[i][0] = firstOperand + " + " + secondOperand;
                    break;
                case 1:
                    gameData[i][1] = Integer.toString(firstOperand - secondOperand);
                    gameData[i][0] = firstOperand + " - " + secondOperand;
                    break;
                case 2:
                    gameData[i][1] = Integer.toString(firstOperand * secondOperand);
                    gameData[i][0] = firstOperand + " * " + secondOperand;
                default:
                    break;
            }
        }
        return Engine.source(condition, gameData);
    }
}
