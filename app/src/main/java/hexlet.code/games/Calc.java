package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;



public class Calc {
    private static final int NUMBER_OF_OPERATORS = 3;
    private static final int MAX_NUMBER_VALUE = 21;

    public static void game() {
        var condition = "What is the result of the expression?";
        var numberOfLevels = Engine.NUMBER_OF_LEVELS;
        String[][] gameData = new String[numberOfLevels][2];
        for (var i = 0; i < numberOfLevels; i++) {
            var indexOperator = Utils.getRandomNum(NUMBER_OF_OPERATORS);
            var firstOperand = Utils.getRandomNum(MAX_NUMBER_VALUE);
            var secondOperand = Utils.getRandomNum(MAX_NUMBER_VALUE);
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
        System.out.println(Engine.source(condition, gameData));
    }
}
