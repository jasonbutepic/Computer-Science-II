import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String secret = "O", flag = "!";
		String wordCurrent = "", wordUpdate = "", letterGuess, wordGuess = "";
		int numGuesses = 0, points = 100;
		Scanner input = new Scanner(System.in);

		System.out.println("WordGuess game. \n");
		for (int i = 0; i < secret.length(); i++) {
			wordCurrent += "-";
		}
		System.out.println(wordCurrent + "\n");

		do {
			System.out.print("Enter a letter (" + flag
					+ " to guess entire word): ");
			letterGuess = input.nextLine();
			letterGuess = letterGuess.toUpperCase();

			points -= 10;
			
			numGuesses += 1;

			if (secret.indexOf(letterGuess) >= 0) {
				wordUpdate = wordCurrent.substring(0,
						secret.indexOf(letterGuess));
				wordUpdate += letterGuess;
				wordUpdate += wordCurrent.substring(
						secret.indexOf(letterGuess) + 1, wordCurrent.length());
				wordCurrent = wordUpdate;
			}

			System.out.println(wordCurrent + "\n");

			System.out.println("Points: " + points + "\n");
			
			if (points <= 0) {
				System.out.print("Sorry, you lose.");
				System.exit(0);
			}

		} while (!letterGuess.equals(flag) && !wordCurrent.equals(secret));

		if (letterGuess.equals(flag)) {
			System.out.println("What is your guess? ");
			wordGuess = input.nextLine();
			wordGuess = wordGuess.toUpperCase();
		}
		if (wordGuess.equals(secret) || wordCurrent.equals(secret)) {
			System.out.print("You win, with a score of " + points + "!");
		} else {
			System.out.print("Sorry, you lose.");
		}
	}

}
