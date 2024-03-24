package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameRound;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BrainProgression {
    public static void runGame() {
        String mainQuestion = "What number is missing in the progression?\n";

        var rounds = new GameRound[Engine.countCycle];

        for (var i = 0; i < Engine.countCycle; i++) {
            rounds[i] = buildRound();
        }

        Engine.engineGame(mainQuestion, rounds);
    }

    public static GameRound buildRound() {
        var random = new Random();

        var progressionLength = random.nextInt(5) + 6;
        var startProgressionNumber = random.nextInt(25) + 1;
        var distanceBetween = random.nextInt(4) + 2;

        List<String> progression = new ArrayList<>();
        for (var i = 0; i < progressionLength; i++) {
            var progress = (startProgressionNumber + i * distanceBetween);
            progression.add(Integer.toString(progress));
        }

        var lenProgress = progression.size();
        var indexOfReplaceSymbol = random.nextInt(lenProgress);
        var replaceChar = progression.get(indexOfReplaceSymbol);
        progression.set(indexOfReplaceSymbol, "..");

        return new GameRound(progression.toString(), replaceChar);
    }
}
