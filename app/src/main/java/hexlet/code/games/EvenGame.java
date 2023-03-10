package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class EvenGame {
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void play() {
        Engine.greetUser();
        Engine.showRules(RULE);
        Engine.playRound(generateQuestionAnswerArray());
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
    private static String[][] generateQuestionAnswerArray() {
        String[][] questionAnswerArray = new String[Engine.NUMBER_OF_ROUND][2];
        int number;

        for (int i = 0; i < questionAnswerArray.length; i++) {
            number = Generator.generateNumberFrom0To100();
            questionAnswerArray[i][0] = Integer.toString(number);

            if (isEven(number)) {
                questionAnswerArray[i][1] = "yes";
            } else {
                questionAnswerArray[i][1] = "no";
            }
        }
        return questionAnswerArray;
    }
}
