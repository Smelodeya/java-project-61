package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeGame {
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void play() {
        String[][] questionAnswerArray = generateQuestionAnswerArray();
        new Engine(RULE, questionAnswerArray);
    }

    private static String[][] generateQuestionAnswerArray() {
        String[][] questionAnswerArray = new String[Engine.NUMBER_OF_ROUND][2];
        int number;

        for (int i = 0; i < questionAnswerArray.length; i++) {
            number = Utils.generateNumber(0, 100);
            questionAnswerArray[i][0] = Integer.toString(number);

            String answer = isPrime(number) ? "yes" : "no";
            questionAnswerArray[i][1] = answer;
        }
        return questionAnswerArray;
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
