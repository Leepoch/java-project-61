package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int NUMBER_OF_LEVELS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        var selectedGame = scanner.nextInt();
        System.out.println("Your choice: " +  selectedGame);
        final int GREET = 1;
        final int EVEN = 2;
        final int CALC = 3;
        final int GCD = 4;
        final int PROGRESSION = 5;
        final int PRIME = 6;

        switch (selectedGame) {
            case GREET:
                Cli.greeting();
                break;
            case EVEN:
                System.out.println(Even.game(NUMBER_OF_LEVELS));
                break;
            case CALC:
                System.out.println(Calc.game(NUMBER_OF_LEVELS));
                break;
            case GCD:
                System.out.println(Gcd.game(NUMBER_OF_LEVELS));
                break;
            case PROGRESSION:
                System.out.println(Progression.game(NUMBER_OF_LEVELS));
                break;
            case PRIME:
                System.out.println(Prime.game(NUMBER_OF_LEVELS));
            case 0:
                break;
            default:
                System.out.println("Не правильный номер игры");
                break;
        }
    }
}
