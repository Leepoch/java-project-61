package hexlet.code;

import java.util.Random;

public class Utils {
    public static int getRandomNum(int maxValue, int minValue) {
        Random random = new Random();
        return random.nextInt(maxValue) + minValue;
    }
    public static int getRandomNum(int maxValue) {
        return getRandomNum(maxValue, 0);
    }
}
