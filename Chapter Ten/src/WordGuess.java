

import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String SECRET_WORD = "BRAIN";
		final String FLAG = "!";
		int score = 100;
		String[] wordSoFar = new String[SECRET_WORD.length()];
		String[] updatedWord = new String[SECRET_WORD.length()];
		String letterGuess, wordGuess = "";
		int numGuesses = 0;
		
		/* begin game */
		System.out.println("WordGuess game.\n");
		for (int i = 0; i < SECRET_WORD.length(); i++) {
			wordSoFar[i] = "-";								//word as dashes
			updatedWord[i] = "-";
		}
		for (int i = 0; i < SECRET_WORD.length(); i++) {
			System.out.print(wordSoFar[i]);			//display dashes
		}
		System.out.println();
	
		/* allow player to make guesses*/
		do {
			System.out.print("Enter a letter (" + FLAG + " to guess entire word): ");
			letterGuess = input.nextLine();
			letterGuess = letterGuess.toUpperCase();			
		
			/* increment number of guesses */
			numGuesses += 1;

			/* player correctly guessed a letter--extract string in wordSoFar up to the letter 
			 * guessed and then append guessed letter to that string. Next, extract rest of 
			 * wordSoFar and append after the guessed letter
			 */
			if (SECRET_WORD.indexOf(letterGuess) >= 0) {
				for (int i = 0; i < SECRET_WORD.length(); i++) {
					if (SECRET_WORD.charAt(i) == letterGuess.charAt(0)) {
						updatedWord[i] = letterGuess;
					}
				}
				wordSoFar = updatedWord.clone();
			}

			/* display guessed letter instead of dash */
			for (int i = 0; i < SECRET_WORD.length(); i++) {
				System.out.print(wordSoFar[i]);
			}
			System.out.println("\n");
			score -= 10;
		} while (!letterGuess.equals(FLAG) && !String.join("", wordSoFar).equals(SECRET_WORD) && score > 0);
		
		/* finish game and display message and number of guesses */
		if (letterGuess.equals(FLAG)) {
			System.out.println("What is your guess? ");
			wordGuess = input.nextLine();
			wordGuess = wordGuess.toUpperCase();
		}
		if (wordGuess.equals(SECRET_WORD) || String.join("", wordSoFar).equals(SECRET_WORD)) {
			System.out.println("You won!");		
		} else {
			System.out.println("Sorry. You lose.");
		}
		if (score == 0) {
			System.out.println("Your score is 0. You lose.");
		}
		System.out.println("The secret word is " + SECRET_WORD);
		System.out.println("You made " + numGuesses + " guesses.");
		System.out.println("Your score is " + score);
}
}