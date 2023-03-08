package hexlet.code.games;

import hexlet.code.Engine;

public class GCDGame {
    private static final String RULE = "Find the greatest common divisor of given numbers.";

    private static String[][] generateQuestionAnswerArray() {
        String[][] questionAnswerArray = new String[Engine.NUMBER_OF_ROUND][2];
        int initialValueOfNumbers = 1;
        int finalValueOfNumbers = 100;
        int number1;
        int number2;

        for (int i = 0; i < questionAnswerArray.length; i++) {
            number1 = initialValueOfNumbers + (int) (Math.random() * finalValueOfNumbers);
            number2 = initialValueOfNumbers + (int) (Math.random() * finalValueOfNumbers);
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
