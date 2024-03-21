package games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Cli;

public class BrainEven {
    public static void brainEven() {
        final int countCycle = 3;
        // generation a random number
        var random = new Random();
        // scan
        var scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var i = 0;
        while (i < countCycle) {
            var randomNumber = random.nextInt(1, 30);
            System.out.println("Question: " + randomNumber);

            System.out.print("Your answer: ");
            var answerChoice = scanner.next();

            var oppositeAnswerChoice = ((answerChoice.equals("yes")) ? "no": "yes");
            if (randomNumber % 2 == 0 && answerChoice.equals("yes") || randomNumber % 2 != 0 && answerChoice.equals("no")) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + answerChoice + "' is wrong answer ;(. Correct answer was '" + oppositeAnswerChoice + "'.\n" + "Let's try again, " + Cli.name +"!");
                System.exit(0);
            }
        }

        System.out.println("Congrulations! " + Cli.name);

    }
}
