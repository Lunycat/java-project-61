package hexlet.code;

import hexlet.code.games.CalculateGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;
import java.util.Scanner;
import static java.lang.System.out;

public class App {
    public static String userName;
    public static int countCorrectAnswer = 0;
    public static Scanner scanner;
    public static String selectionAnswer;
    public static String correctAnswer;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int gameNumber;

        out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
        gameNumber = scanner.nextInt();

        if (gameNumber > 0 && gameNumber < 7) {
            out.print("""

                Welcome to the Brain Games!
                May I have your name?\s""");
            userName = scanner.next();
            out.printf("Hello, %s!\n", userName);

            if (gameNumber == 2) {
                EvenGame.startEvenGame();
            } else if (gameNumber == 3) {
                CalculateGame.startCalculateGame();
            } else if (gameNumber == 4) {
                GCDGame.startGCDGame();
            } else if (gameNumber == 5) {
                ProgressionGame.startProgressionGame();
            } else if (gameNumber == 6) {
                PrimeGame.startPrimeGame();
            }
            scanner.close();
        }
    }
}
