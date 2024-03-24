package hexlet.code.games;

import java.util.Random;
import hexlet.code.GameRound;
import hexlet.code.Engine;

public class BrainEven {
    public static void runGame() {
        String mainQuestion = "Answer 'yes' if the number is even, otherwise answer 'no'.\n";

        var rounds = new GameRound[Engine.countCycle];

        for (var i = 0; i < Engine.countCycle; i++) {
            rounds[i] = buildRound();
        }

        Engine.engineGame(mainQuestion, rounds);
    }

    public static GameRound buildRound() {
        var random = new Random();
        var randomNumber = random.nextInt(1, 100);

        var answer = ((randomNumber % 2 == 0) ? "yes": "no");
        var question = Integer.toString(randomNumber);

        return new GameRound(question, answer);
    }
}
