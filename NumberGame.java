import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        char playAgain;

        do {
            int number = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;
            boolean guessed = false;

            System.out.println("\n===== NUMBER GUESSING GAME =====");
            System.out.println("Guess the number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("🎉 Correct! You guessed the number in " + attempts + " attempts.");
                    guessed = true;
                    score++;
                    break;
                } else if (guess > number) {
                    System.out.println("Too High! Try again.");
                } else {
                    System.out.println("Too Low! Try again.");
                }
            }

            if (!guessed) {
                System.out.println("❌ Out of attempts! The correct number was: " + number);
            }

            System.out.print("Do you want to play another round? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("\n💯 Your Final Score = " + score);
        System.out.println("Thanks for playing!");
        sc.close();
    }
}
