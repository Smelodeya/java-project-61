package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class PrimeGame {
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void play() {
        Engine.greetUser();
        Engine.showRules(RULE);
        Engine.playRound(generateQuestionAnswerArray());
    }

    private static String[][] generateQuestionAnswerArray() {
        String[][] questionAnswerArray = new String[Engine.NUMBER_OF_ROUND][2];
        int number;

        for (int i = 0; i < questionAnswerArray.length; i++) {
            number = Generator.generateNumberFrom0To100();
            questionAnswerArray[i][0] = Integer.toString(number);

            if (isPrimary(number)) {
                questionAnswerArray[i][1] = "yes";
            } else {
                questionAnswerArray[i][1] = "no";
            }
        }
        return questionAnswerArray;
    }

    public static boolean isPrimary(int number) {
        double endCalculation = Math.sqrt(number);
        boolean isPrimary = true;
        int i = 2;
        while ((i <= endCalculation) && (isPrimary)) {
            if (number % i == 0) {
                isPrimary = false;
            }
            i++;
        }
        return isPrimary;
    }
}
