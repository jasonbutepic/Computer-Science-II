

import java.util.Scanner;

    public class Mastermind {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Get user input for number of pegs and colors
            System.out.print("Enter the number of pegs: ");
            int numPegs = input.nextInt();
            System.out.print("Enter the number of colors: ");
            int numColors = input.nextInt();

            // Create a new MastermindGame object with the user's input
            MastermindGame game = new MastermindGame(numPegs, numColors);

            // Play the game until the user guesses the code
            boolean guessed = false;
            while (!guessed) {
                // Get user input for their guess
                System.out.print("Enter your guess (separated by spaces): ");
                int[] guess = new int[numPegs];
                for (int i = 0; i < numPegs; i++) {
                    guess[i] = input.nextInt();
                }

                // Check the user's guess and display the results
                int[] result = game.checkGuess(guess);
                System.out.println("Correct color and position: " + result[0]);
                System.out.println("Correct color but wrong position: " + result[1]);

                // Check if the user guessed the code
                if (result[0] == numPegs) {
                    System.out.println("Congratulations, you guessed the code!");
                    guessed = true;
                }
            }
        }
    }