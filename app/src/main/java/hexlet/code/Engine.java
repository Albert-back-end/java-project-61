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

        if (choice == 1) {
            System.out.println(" ");
            Cli.greetingUser();
        } else if (choice == 2) {
            System.out.println(" ");

            Cli.greetingUser();
            BrainEven.brainEven();
        } else if (choice == 0){
            System.exit(0);
        } else {
            System.out.println("Uncorrect answer!");
        }
    }
}
