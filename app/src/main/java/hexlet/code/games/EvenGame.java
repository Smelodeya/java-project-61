package hexlet.code.games;

import hexlet.code.App;

public class EvenGame {
    public static void play() {
        int i = 0;
        boolean userAnswerCheck = true;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        while ((i < 3) && (userAnswerCheck)) {

            int number = (int) (Math.random() * 100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = App.scanner.next();

            if ((isEven(number)) && (userAnswer.equalsIgnoreCase("yes"))) {
                System.out.println("Correct!");
                i++;
            } else if (!(isEven(number)) && (userAnswer.equalsIgnoreCase("no"))) {
                System.out.println("Correct!");
                i++;
            } else {
                if (isEven(number)) {
                    System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                } else {
                    System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                }
                userAnswerCheck = false;
            }
        }

        if (i == 3) {
            System.out.println("Congratulations, " + App.userName + "!");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
