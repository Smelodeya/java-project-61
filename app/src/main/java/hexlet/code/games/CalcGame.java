package hexlet.code.games;

import hexlet.code.App;

public class CalcGame {
    public static void play() {
        int i = 0;
        boolean userAnswerCheck = true;

        System.out.println("What is the result of the expression?");

        while ((i < 3) && (userAnswerCheck)) {

            int number1 = (int) (Math.random() * 100);
            int number2 = (int) (Math.random() * 100);
            String[] operators = new String[] {"+", "-", "*"};
            int indexOfOperators = (int) (Math.random() * operators.length);

            System.out.println("Question: " + number1 + " " + operators[indexOfOperators] + " " + number2 );
            System.out.print("Your answer: ");
            String userAnswer = App.scanner.next();
            String rightAnswer = Integer.toString(calculate(number1, number2, operators[indexOfOperators]));

            if (rightAnswer.equalsIgnoreCase(userAnswer)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
                System.out.println("Let's try again, " + App.userName + "!");
                userAnswerCheck = false;
            }
        }

        if (i == 3) {
            System.out.println("Congratulations, " + App.userName + "!");
        }
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
