package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCDGame {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final String RULE = "Find the greatest common divisor of given numbers.";

    public static void play() {
        String[][] questionsAnswers = generateQuestionsAnswers();
        Engine.play(RULE, questionsAnswers);
    }

    private static String[][] generateQuestionsAnswers() {
        String[][] questionsAnswers = new String[Engine.NUMBER_OF_ROUND][2];

        for (int i = 0; i < questionsAnswers.length; i++) {
            questionsAnswers[i] = generateRoundQuestionAnswer();
        }
        return questionsAnswers;
    }

    private static String[] generateRoundQuestionAnswer() {
        int number1 = Utils.generateNumber(MIN, MAX);
        int number2 = Utils.generateNumber(MIN, MAX);
        String question = number1 + " "  + number2;
        String answer = Integer.toString(findGCD(number1, number2));
        return new String[] {question, answer};
    }

    private static int findGCD(int a, int b) {
        return a % b == 0 ? b : findGCD(b, a % b);
    }
}
