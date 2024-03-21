package hexlet.code;

import java.util.Scanner;
import games.BrainEven;

public class Engine {
    public static void choiceGame() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        var scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        var choice = scanner.nextInt();

        switch (choice) {
            case (1):
                System.out.println(" ");
                Cli.greetingUser();
                break;
            case (2):
                System.out.println(" ");
                Cli.greetingUser();
                BrainEven.brainEven();
                break;
            case (0):
                System.exit(0);
                break;
            default:
                System.out.println("Uncorrect answer!");
        }
    }
}
