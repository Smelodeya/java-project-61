package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static String userName;
    public static String userChoice;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");

        userChoice = scanner.next();
        System.out.println("Your choice: " + userChoice);
        switch (userChoice) {
            case "0":
                System.out.println("Goodbye");
                break;
            case "1":
                greet();
                break;
            case "2":
                greet();
                EvenGame.play();
                break;
            case "3":
                greet();
                CalcGame.play();
                break;
        }

        scanner.close();
    }

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("What is your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
    }
}
