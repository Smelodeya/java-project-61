package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class CalcGame {
    private static final String RULE = "What is the result of the expression?";
    public static void play() {
        Engine.greetUser();
        Engine.showRules(RULE);
        Engine.playRound(generateQuestionAnswerArray());
    }

    public static String[][] generateQuestionAnswerArray() {
        String[][] questionAnswerArray = new String[Engine.NUMBER_OF_ROUND][2];
        int number1;
        int number2;
        String[] operators = new String[] {"+", "-", "*"};
        int operator;

        for (int i = 0; i < questionAnswerArray.length; i++) {
            number1 = (int) (Math.random() * 100);
            number2 = (int) (Math.random() * 100);
            operator = (int) (Math.random() * operators.length);
            questionAnswerArray[i][0] = number1 + " " + operators[operator] + " " + number2;
            questionAnswerArray[i][1] = Integer.toString(calculate(number1, number2, operators[operator]));
        }
        return questionAnswerArray;
    }

    public static int calculate(int number1, int number2, String operator) {
        int result = 0;

        if (operator.equals("+")) {
            result = number1 + number2;
        }

        if (operator.equals("-")) {
            result = number1 - number2;
        }

        if (operator.equals("*")) {
            result = number1 * number2;
        }

        return result;
    }
}
