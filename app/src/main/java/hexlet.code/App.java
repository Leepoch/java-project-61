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
                0 - Exit""");
        var selectedGame = scanner.nextInt();
        System.out.println("Your choice: " +  selectedGame);

        switch (selectedGame) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                System.out.println(Even.gameEven());;
                break;
            case 3:
                System.out.println(Calc.gameCalc());
            case 0:

        }
    }
}
