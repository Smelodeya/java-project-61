package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class ProgressionGame {
    private static final int MIN = 0;
    private static final int MAX = 100;
    private static final String RULE = "What number is missing in the progression?";
    private static final int PROGRESSION_LENGTH = 10;

    public static void play() {
        String[][] questionAnswerArray = generateQuestionAnswerArray();
        Engine.playRounds(RULE, questionAnswerArray);
    }
    private static String[][] generateQuestionAnswerArray() {
        String[][] questionAnswerArray = new String[Engine.NUMBER_OF_ROUND][2];

        for (int i = 0; i < questionAnswerArray.length; i++) {
            int first = Utils.generateNumber(MIN, MAX);
            int step = Utils.generateNumber(MIN + 1, MAX/10);
            int hiddenMemberIndex = Utils.generateNumber(0, PROGRESSION_LENGTH - 1);
            String[] progression = makeProgression(first, step, PROGRESSION_LENGTH);
            String answer = progression[hiddenMemberIndex];
            progression[hiddenMemberIndex] = "..";
            String question = String.join(" ", progression);

            questionAnswerArray[i][0] = question;
            questionAnswerArray[i][1] = answer;
        }
        return questionAnswerArray;
    }

    private static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];

        for (int i = 0; i < length; i += 1) {
            progression[i] = Integer.toString(first + i * step);
        }

        return progression;
    }
}
