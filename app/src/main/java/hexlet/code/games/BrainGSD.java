package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameRound;
import java.util.Random;

public class BrainGSD {
    public static void runGame() {
        String mainQuestion = "Find the greatest common divisor of given numbers.\n";

        var rounds = new GameRound[Engine.countCycle];

        for (var i = 0; i < Engine.countCycle; i++) {
            rounds[i] = buildRound();
        }

        Engine.engineGame(mainQuestion, rounds);
    }

    public static GameRound buildRound() {
        var random = new Random();
        var firstRandomNumber = random.nextInt(1, 100);
        var secondRandomNumber = random.nextInt(1, 100);

        var question = firstRandomNumber + " " + secondRandomNumber;
        var answer = Integer.toString(gcd(firstRandomNumber, secondRandomNumber));

        return new GameRound(question, answer);
    }

    public static int gcd(int a, int b) {
        // stores minimum(a, b)
        int i;
        if (a < b)
            i = a;
        else
            i = b;

        for (i = i; i > 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }
}
