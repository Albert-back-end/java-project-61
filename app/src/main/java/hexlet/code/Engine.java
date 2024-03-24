package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.BrainEven;

public class Engine {
    public static final int countCycle = 3;
    public static void engineGame(String mainQuestion, GameRound[] rounds) {
        System.out.print(mainQuestion);

        for (var round: rounds) {
            var unitedQuestion = "Question: " + round.getQuestion();
            System.out.println(unitedQuestion);

            var scanner = new Scanner(System.in);
            System.out.print("Your answer: ");
            var answer = round.getAnswer();
            var scanAnswer = scanner.next();

            if (!scanAnswer.equals(answer)){
                var errorMessage = ("'" + scanAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'. Let's try again, " + Cli.name + "!");
                System.out.println(errorMessage);
                System.exit(0);
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + Cli.name + "!");
    }
}
