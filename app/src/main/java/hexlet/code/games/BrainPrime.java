package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameRound;

import java.util.Random;

public class BrainPrime {
    public static void runGame() {
        String mainQuestion = "Answer 'yes' if given number is prime. Otherwise answer 'no'.\n";

        var rounds = new GameRound[Engine.countCycle];

        for (var i = 0; i < Engine.countCycle; i++) {
            rounds[i] = buildRound();
        }

        Engine.engineGame(mainQuestion, rounds);
    }

    public static GameRound buildRound() {
        var random = new Random();
        var randomNumber = random.nextInt(113) + 1;

        var answer = (isPrime(randomNumber) ? "yes": "no");

        return new GameRound(Integer.toString(randomNumber), answer);
    }

    public static boolean isPrime(int n) {
        int i;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
