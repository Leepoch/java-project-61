package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static String game(int numberOfLevels) {
        var condition = "What is the result of the expression?";
        Random random = new Random();
        String[][] gameData = new String[numberOfLevels][2];

        for (var i = 0; i < numberOfLevels; i++) {
            var numberOfOperators = 3;
            var maxNumberValue = 21;
            var indexOperator = random.nextInt(numberOfOperators);
            var firstOperand = random.nextInt(maxNumberValue);
            var secondOperand = random.nextInt(maxNumberValue);
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
