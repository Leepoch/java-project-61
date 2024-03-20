package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        var name = scanner.nextLine();
        System.out.println("May I have your name?");
        System.out.println("Hello, " + name + "!");
    }
}
