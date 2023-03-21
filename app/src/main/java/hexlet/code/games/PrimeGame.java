package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeGame {
    private static final int MIN = 0;
    private static final int MAX = 100;
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void play() {
        String[][] questionsAnswers = generateQuestionsAnswers();
        Engine.play(RULE, questionsAnswers);
    }

    private static String[][] generateQuestionsAnswers() {
        String[][] questionsAnswers = new String[Engine.NUMBER_OF_ROUND][2];
        int number;

        for (int i = 0; i < questionsAnswers.length; i++) {
            questionsAnswers[i] = generateRoundQuestionAnswer();
        }
        return questionsAnswers;
    }

    private static String[] generateRoundQuestionAnswer() {
        int number = Utils.generateNumber(MIN, MAX);
        String question = Integer.toString(number);
        String answer = isPrime(number) ? "yes" : "no";
        return new String[] {question, answer};
    }

    public static boolean isPrime(int number) {
        double endCalculation = Math.sqrt(number);
        boolean isPrime = number > 1;
        int i = 2;

        while ((i <= endCalculation) && (isPrime)) {
            if (number % i == 0) {
                isPrime = false;
            }
            i++;
        }
        return isPrime;
    }
}
