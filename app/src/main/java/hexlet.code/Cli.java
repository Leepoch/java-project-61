package hexlet.code;

import java.util.Scanner;
import java.util.StringJoiner;

public class Cli {
	public static void greeting() {
		Scanner scanner = new Scanner(System.in);
		var greeting = new StringJoiner(" ");
		greeting.add("Hello,");
		greeting.add(scanner.nextLine());
		System.out.println(greeting);
	}
}
