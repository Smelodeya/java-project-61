package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class EvenGame {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void play() {
        String[][] questionAnswerArray = generateQuestionAnswerArray();
        Engine.playRounds(RULE, questionAnswerArray);
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
    private static String[][] generateQuestionAnswerArray() {
        String[][] questionAnswerArray = new String[Engine.NUMBER_OF_ROUND][2];
        int number;

        for (int i = 0; i < questionAnswerArray.length; i++) {
            number = Utils.generateNumber(MIN, MAX);
            questionAnswerArray[i][0] = Integer.toString(number);

            String answer = isEven(number) ? "yes" : "no";
            questionAnswerArray[i][1] = answer;
        }
        return questionAnswerArray;
    }
}
