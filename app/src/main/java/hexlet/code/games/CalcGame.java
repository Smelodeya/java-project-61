package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalcGame {
    private static final String RULE = "What is the result of the expression?";
    private static final int MIN = 0;
    private static final int MAX = 100;
    public static void play() {
        String[][] questionsAnswers = generateQuestionsAnswers();
        Engine.play(RULE, questionsAnswers);
    }

    public static String[][] generateQuestionsAnswers() {
        String[][] questionsAnswers = new String[Engine.NUMBER_OF_ROUND][2];

        for (int i = 0; i < questionsAnswers.length; i++) {
            questionsAnswers[i] = generateRoundQuestionAnswer();
        }
        return questionsAnswers;
    }

    private static String[] generateRoundQuestionAnswer() {
        char[] operators = new char[] {'+', '-', '*'};
        int number1 = Utils.generateNumber(MIN, MAX);
        int number2 = Utils.generateNumber(MIN, MAX);
        int operator = Utils.generateNumber(MIN, operators.length - 1);
        String question = number1 + " " + operators[operator] + " " + number2;
        String answer = Integer.toString(calculate(number1, number2, operators[operator]));
        return new String[] {question, answer};
    }

    public static int calculate(int number1, int number2, char operator) {

        return switch (operator) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new RuntimeException("Unknown operation: " + operator);
        };
    }
}
