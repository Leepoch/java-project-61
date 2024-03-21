package hexlet.code;

import java.util.Random;

public class Even {
    public static String game() {
        var condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Random random = new Random();
        String[][] gameData = new String[3][2];

        for (var i = 0; i < 3; i++) {
            var question = random.nextInt(21);
            String correctAnswer = question % 2 == 0 ? "yes" : "no";
            gameData[i][0] = Integer.toString(question);
            gameData[i][1] = correctAnswer;
        }
        return Engine.source(condition, gameData);
    }
}
