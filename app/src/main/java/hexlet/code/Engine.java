package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner scanner = new Scanner(System.in);
    public static final int NUMBER_OF_ROUND = 3;
    private static final String WRONG_ANSWER = "' is wrong answer ;(. Correct answer was '";

    private static String getUserInput() {
        return scanner.next();
    }

    public static void play(String rule, String[][] questionsAnswers) {

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = getUserInput();
        System.out.println("Hello, " + userName + "!");

        System.out.println(rule);

        for (String[] questionAnswer : questionsAnswers) {
            if (!playRound(questionAnswer, userName)) {
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }

    private static boolean playRound(String[] questionAnswer, String userName) {
        String question = questionAnswer[0];
        String answer = questionAnswer[1];
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        String userAnswer = getUserInput();
        if (userAnswer.equalsIgnoreCase(answer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + userAnswer + WRONG_ANSWER + answer + "'");
            System.out.println("Let's try again, " + userName + "!");
        }
        return userAnswer.equalsIgnoreCase(answer);
    }


}
