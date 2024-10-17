package game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private int numberToGuess;
    private int numberOfTries;

    public Game() {
        Random random = new Random();
        numberToGuess = random.nextInt(100) + 1; // Number between 1 and 100
        numberOfTries = 0;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            System.out.println("Guess the number (between 1 and 100): ");
            int guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
            }
        }
        scanner.close();
    }
}
package game;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}
