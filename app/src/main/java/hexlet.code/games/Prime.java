package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static String game(int numberOfLevels) {
        var condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Random random = new Random();
        String[][] gameData = new String[numberOfLevels][2];

        for (var i = 0; i < numberOfLevels; i++) {
            var maxNumberValue = 24;
            var primeNumber = random.nextInt(maxNumberValue) + 1;
            var isPrime = true;
            for (var divisor = 1; divisor <= primeNumber; divisor++) {
                if (divisor != 1 && divisor != primeNumber && primeNumber % divisor == 0 || primeNumber == 1) {
                    isPrime = false;
                }
            }
            gameData[i][0] = Integer.toString(primeNumber);
            gameData[i][1] = isPrime ? "yes" : "no";
        }
        return Engine.source(condition, gameData);
    }
}
