package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class EvenGame {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void play() {
        String[][] questionsAnswers = generateQuestionsAnswers();
        Engine.play(RULE, questionsAnswers);
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
    private static String[][] generateQuestionsAnswers() {
        String[][] questionsAnswers = new String[Engine.NUMBER_OF_ROUND][2];

        for (int i = 0; i < questionsAnswers.length; i++){
            questionsAnswers[i] = generateRoundQuestionAnswer();
        }

        return questionsAnswers;
    }

    private static String[] generateRoundQuestionAnswer() {
        int number = Utils.generateNumber(MIN, MAX);
        String question = Integer.toString(number);
        String answer = isEven(number) ? "yes" : "no";
        return new String[] {question, answer};
    }
}
