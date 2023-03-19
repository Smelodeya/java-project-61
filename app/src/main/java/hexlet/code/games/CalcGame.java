package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalcGame {
    private static final String RULE = "What is the result of the expression?";
    public static void play() {
        String[][] questionAnswerArray = generateQuestionAnswerArray();
        new Engine(RULE, questionAnswerArray);
    }

    public static String[][] generateQuestionAnswerArray() {
        String[][] questionAnswerArray = new String[Engine.NUMBER_OF_ROUND][2];
        int number1;
        int number2;
        char[] operators = new char[] {'+', '-', '*'};
        int operator;

        for (int i = 0; i < questionAnswerArray.length; i++) {
            number1 = Utils.generateNumber(0, 100);
            number2 = Utils.generateNumber(0, 100);
            operator = (int) (Math.random() * operators.length);
            questionAnswerArray[i][0] = number1 + " " + operators[operator] + " " + number2;
            questionAnswerArray[i][1] = Integer.toString(calculate(number1, number2, operators[operator]));
        }
        return questionAnswerArray;
    }

    public static int calculate(int number1, int number2, char operator) {

        return switch (operator) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> 0; // ???????????
        };
    }
}
