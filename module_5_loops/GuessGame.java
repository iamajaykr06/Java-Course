package module_5_loops;

import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        do {
            System.out.print("Guess number (1-100): ");
            guess = sc.nextInt();
            attempts++;

            if (guess > target) {
                System.out.println("Too high!");
            } else if (guess < target) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct!");
            }

        } while (guess != target);

        System.out.println("Attempts: " + attempts);
        sc.close();
    }
}