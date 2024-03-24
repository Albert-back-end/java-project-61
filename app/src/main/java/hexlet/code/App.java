package hexlet.code;

import hexlet.code.games.BrainCalc;
import hexlet.code.games.BrainEven;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final var numberOfGreeting = 1;
        final var numberOfEven = 2;
        final var numberOfCalc = 3;
        final var numberOfGSD = 4;
        final var numberOfProgression = 5;
        final var numberOfPrime = 6;
        final var numberOfExit = 0;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println(numberOfGreeting + " - Greet");
        System.out.println(numberOfEven + " - Even");
        System.out.println(numberOfCalc + " - Calc");
        System.out.println(numberOfExit + " - Exit");

        var scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        var choice = scanner.nextInt();
        System.out.println();

        switch (choice) {
            case (numberOfGreeting):
                Cli.greetingUser();
                break;
            case (numberOfEven):
                Cli.greetingUser();
                BrainEven.runGame();
                break;
            case (numberOfCalc):
                Cli.greetingUser();
                BrainCalc.runGame();
                break;
            case (numberOfExit):
                System.exit(0);
                break;
            default:
                System.out.println("Uncorrect answer!");
        }
    }
}
