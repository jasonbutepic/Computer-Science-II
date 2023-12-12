import java.util.Random;
import java.util.Scanner;


public class GuessingGameCh7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int secret, guess;
		Random r = new Random();
		Scanner input = new Scanner(System.in);
	
		secret = r.nextInt(20 - 1 + 1) + 1;
		
		System.out.print("Enter a number between 1 and 20: ");
		guess = input.nextInt();
        while (guess < 1 || guess > 20) {
            System.out.println("Invalid guess. Enter a number between 1 and 20: ");
            guess = input.nextInt();
        }

		while (secret != guess) {

            giveHint(guess, secret);
            
            System.out.print("Enter a number between 1 and 20: ");
            guess = input.nextInt();
            while (guess < 1 || guess > 20) {
                System.out.println("Invalid guess. Enter a number between 1 and 20: ");
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

    public static void giveHint(int guess, int secret){
        if (guess < secret) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }
    }

}