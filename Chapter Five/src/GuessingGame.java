import java.util.Random;
import java.util.Scanner;


public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int secret, guess;
		Random r = new Random();
		Scanner input = new Scanner(System.in);
	
		secret = r.nextInt(20 - 1 + 1) + 1;
		
		System.out.print("Enter a number between 1 and 20: ");
		guess = input.nextInt();
		
		while (secret != guess) {
			System.out.println("Computer's number: " + secret);
			System.out.println("Player's number: " + guess);
			
			if (secret != guess) {
				secret = r.nextInt(20 - 1 + 1) + 1;
				System.out.println("Nope. Guess again.");
				guess = input.nextInt();
			}
		}
		
		if (secret == guess) {
			input.close();
			System.out.println("Computer's number: " + secret);
			System.out.println("Player's number: " + guess);
			System.out.println("You won!");
		}
	}

}