package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static final int NUMBER_OF_LEVELS = 3;

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

        switch (selectedGame) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                System.out.println(Even.game(NUMBER_OF_LEVELS));
                break;
            case 3:
                System.out.println(Calc.game(NUMBER_OF_LEVELS));
                break;
            case 4:
                System.out.println(GCD.game(NUMBER_OF_LEVELS));
                break;
            case 5:
                System.out.println(Progression.game(NUMBER_OF_LEVELS));
                break;
            case 6:
                System.out.println(Prime.game(NUMBER_OF_LEVELS));
            case 0:
                break;
            default:
                System.out.println("Не правильный номер игры");
                break;
        }
    }
}
