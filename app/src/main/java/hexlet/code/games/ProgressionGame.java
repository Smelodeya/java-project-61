package hexlet.code.games;

import hexlet.code.Engine;

public class ProgressionGame {
    private static final String RULE = "What number is missing in the progression?";

    public static void play() {
        Engine.greetUser();
        Engine.showRules(RULE);
        Engine.playRound(generateQuestionAnswerArray());
    }
    private static String[][] generateQuestionAnswerArray() {
        String[][] questionAnswerArray = new String[Engine.NUMBER_OF_ROUND][2];
        int[] progression;
        int hideNumber;
        int indexOfHideNumber;

        for (int i = 0; i < questionAnswerArray.length; i++) {
            progression = generateProgression();
            indexOfHideNumber = (int) (Math.random() * (progression.length) - 1);
            hideNumber = progression[indexOfHideNumber];

            questionAnswerArray[i][0] = hideNumber(progression, hideNumber);
            questionAnswerArray[i][1] = Integer.toString(hideNumber);
        }
        return questionAnswerArray;
    }

    private static int[] generateProgression() {
        int progressionLength = 10;
        int beginNumber = (int) (Math.random() * 100);
        int stepProgression = (int) (1 + (Math.random() * 10));
        int[] progression = new int[progressionLength];

        progression[0] = beginNumber;

        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + stepProgression;
        }

        return progression;
    }

    private static String hideNumber(int[] progression, int hideNumber) {
        StringBuilder progressionToStr = new StringBuilder();

        for (int value : progression) {
            if (value == hideNumber) {
                progressionToStr.append(".. ");
            } else {
                progressionToStr.append(value);
                progressionToStr.append(" ");
            }
        }
        return progressionToStr.toString();
    }
}
