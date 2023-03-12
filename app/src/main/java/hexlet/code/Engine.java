package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_ROUND = 3;
    private static final String WRONG_ANSWER = "' is wrong answer ;(. Correct answer was '";
    private static String userName;
    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        //scanner.close(); // если здесь закрываю поток ,то при работе метода playRound выходит ошибка
                        // Exception in thread "main" java.util.NoSuchElementException
                        // at java.base/java.util.Scanner.throwFor(Scanner.java:937)
    }

    public static void showRules(String rule) {
        System.out.println(rule);
    }

    public static void playRound(String[][] questionAnswerArray) {
        Scanner scanner = new Scanner(System.in);
        int currentRound = 0;
        boolean isUserAnswerRight = true;

        while ((currentRound < NUMBER_OF_ROUND) && (isUserAnswerRight)) {
            System.out.println("Question: " + questionAnswerArray[currentRound][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equalsIgnoreCase(questionAnswerArray[currentRound][1])) {
                currentRound++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + WRONG_ANSWER + questionAnswerArray[currentRound][1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                isUserAnswerRight = false;
            }
        }

        if (currentRound == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }

        scanner.close();
    }
}
