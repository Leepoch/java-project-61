package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;



public class Calc {
    private static final int NUMBER_OF_OPERATORS = 3;
    private static final int MAX_NUMBER_VALUE = 21;

    public static Integer gameData(int firstOperand, int secondOperand, String operator) {
        var result = 0;
        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            default:
                return null;
        }
        return result;
    }
    public static String[][] prepareData() {
        var numberOfLevels = Engine.NUMBER_OF_LEVELS;
        String[][] gameData = new String[numberOfLevels][2];

        for (var i = 0; i < numberOfLevels; i++) {
            var indexOperator = Utils.getRandomNum(NUMBER_OF_OPERATORS);
            var operators = new String[] {"+", "-", "*"};
            var firstOperand = Utils.getRandomNum(MAX_NUMBER_VALUE);
            var secondOperand = Utils.getRandomNum(MAX_NUMBER_VALUE);
            var correctAnswer = gameData(firstOperand, secondOperand, operators[indexOperator]);
            gameData[i][1] = Integer.toString(correctAnswer);
            gameData[i][0] = firstOperand + " " + operators[indexOperator] + " " + secondOperand;
        }
        return gameData;
    }
    public static void game() {
        var condition = "What is the result of the expression?";
        System.out.println(Engine.source(condition, prepareData()));
    }
}
