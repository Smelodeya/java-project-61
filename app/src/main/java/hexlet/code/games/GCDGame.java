package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class GCDGame {
    private static final String RULE = "Find the greatest common divisor of given numbers.";

    private static String[][] generateQuestionAnswerArray() {
        String[][] questionAnswerArray = new String[Engine.NUMBER_OF_ROUND][2];
        int number1;
        int number2;

        for (int i = 0; i < questionAnswerArray.length; i++) {
            number1 = Generator.generateNumberFrom1To100();
            number2 = Generator.generateNumberFrom1To100();
            questionAnswerArray[i][0] = number1 + " "  + number2;
            questionAnswerArray[i][1] = Integer.toString(findGCD(number1, number2));
        }
        return questionAnswerArray;
    }

    private static int findGCD(int a, int b) {
        return a % b == 0 ? b : findGCD(b, a % b);
    }

    public static void play() {
        Engine.greetUser();
        Engine.showRules(RULE);
        Engine.playRound(generateQuestionAnswerArray());
    }
}
