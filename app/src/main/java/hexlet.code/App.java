package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
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
        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;

        switch (selectedGame) {
            case greet:
                Cli.greeting();
                break;
            case even:
                Even.game();
                break;
            case calc:
                Calc.game();
                break;
            case gcd:
                Gcd.game();
                break;
            case progression:
                Progression.game();
                break;
            case prime:
                Prime.game();
            case 0:
                break;
            default:
                System.out.println("Не правильный номер игры");
                break;
        }
    }
}
