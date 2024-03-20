package hexlet.code;

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
                0 - Exit""");
        var selectedGame = scanner.nextInt();
        System.out.println("Your choice: " +  selectedGame);

        switch (selectedGame) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                System.out.println(Even.game());;
                break;
            case 3:
                System.out.println(Calc.game());
            case 4:
                System.out.println(GCD.game());
            case 5:
                System.out.println(Progression.game());
            case 0:

        }
    }
}
