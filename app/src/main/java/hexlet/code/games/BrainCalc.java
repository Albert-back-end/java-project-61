package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.GameRound;
import java.util.Random;

public class BrainCalc {
    public static void runGame() {
        String mainQuestion = "What is the result of the expression?\n";

        var rounds = new GameRound[Engine.countCycle];

        for (var i = 0; i < Engine.countCycle; i++) {
            rounds[i] = buildRound();
        }

        Engine.engineGame(mainQuestion, rounds);
    }

    public static GameRound buildRound() {
        var random = new Random();
        var firstRandomNumber = random.nextInt(1, 20);
        var secondRandomNumber = random.nextInt(1, 10);

        var operator = generateOperator();
        var answer = 0;

        var question = firstRandomNumber + " " + operator + " " + secondRandomNumber;

        switch (operator) {
            case "+":
                answer = firstRandomNumber + secondRandomNumber;
                break;
            case "-":
                answer = firstRandomNumber - secondRandomNumber;
                break;
            case "*":
                answer = firstRandomNumber * secondRandomNumber;
                break;
        }

        return new GameRound(question, Integer.toString(answer));
    }

    private static String generateOperator() {
        String[] operators = {"+", "-", "*"};
        Random indicator = new Random();
        var num = indicator.nextInt(operators.length);
        return operators[num];
    }
}
