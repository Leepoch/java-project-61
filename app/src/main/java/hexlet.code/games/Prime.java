package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final int MAX_NUMBER_VALUE = 24;

    public static boolean gameData(int primeNumber) {
        var isPrime = true;
        for (var divisor = 1; divisor <= primeNumber; divisor++) {
            if (divisor != 1 && divisor != primeNumber && primeNumber % divisor == 0 || primeNumber == 1) {
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static String[][] prepareData() {
        var numberOfLevels = Engine.NUMBER_OF_LEVELS;
        String[][] gameData = new String[numberOfLevels][2];

        for (var i = 0; i < numberOfLevels; i++) {
            var primeNumber = Utils.getRandomNum(MAX_NUMBER_VALUE) + 1;
            var isPrime = gameData(primeNumber);
            gameData[i][0] = Integer.toString(primeNumber);
            gameData[i][1] = isPrime ? "yes" : "no";
        }
        return gameData;
    }
    public static void game() {
        var condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        System.out.println(Engine.source(condition, prepareData()));
    }
}
