package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCDGame {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final String RULE = "Find the greatest common divisor of given numbers.";

    public static void play() {
        String[][] questionAnswerArray = generateQuestionAnswerArray();
        Engine.playRounds(RULE, questionAnswerArray);
    }

    private static String[][] generateQuestionAnswerArray() {
        String[][] questionAnswerArray = new String[Engine.NUMBER_OF_ROUND][2];

        for (int i = 0; i < questionAnswerArray.length; i++) {
            int number1 = Utils.generateNumber(MIN, MAX);
            int number2 = Utils.generateNumber(MIN, MAX);
            questionAnswerArray[i][0] = number1 + " "  + number2;
            questionAnswerArray[i][1] = Integer.toString(findGCD(number1, number2));
        }
        return questionAnswerArray;
    }

    private static int findGCD(int a, int b) {
        return a % b == 0 ? b : findGCD(b, a % b);
    }
}
