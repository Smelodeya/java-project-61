package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        String gameNumber = scanner.next();

        switch (gameNumber) {
            case "0" -> System.out.println("Goodbye");
            case "1" -> Cli.greet();
            case "2" -> EvenGame.play();
            case "3" -> CalcGame.play();
            case "4" -> GCDGame.play();
            case "5" -> ProgressionGame.play();
            case "6" -> PrimeGame.play();
            default -> System.out.println("Wrong input!");
        }
        scanner.close();
    }
}
