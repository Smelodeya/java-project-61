package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUND = 3;
    private static final String WRONG_ANSWER = "' is wrong answer ;(. Correct answer was '";

    public static void playRounds(String rule, String[][] questionAnswerArray) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(rule);

        int currentRound = 0;
        while (currentRound < NUMBER_OF_ROUND) {
            System.out.println("Question: " + questionAnswerArray[currentRound][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equalsIgnoreCase(questionAnswerArray[currentRound][1])) {
                currentRound++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + WRONG_ANSWER + questionAnswerArray[currentRound][1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
