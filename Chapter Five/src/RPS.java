/* 
	switch (playerThrow) {
		case ROCK:
			if (computerThrow == ROCK) {
				System.out.println("It's a draw!");
			}
			if (computerThrow == PAPER) {
				System.out.println("Computer wins!");
			}
			if (computerThrow == SCISSORS) {
				System.out.println("Player wins!");
			}
			break;
		case PAPER:
			if (computerThrow == ROCK) {
				System.out.println("Player wins!");
			}
			if (computerThrow == PAPER) {
				System.out.println("It's a draw!");
			}
			if (computerThrow == SCISSORS) {
				System.out.println("Computer wins!");
			}
			break;
		case SCISSORS:
			if (computerThrow == ROCK) {
				System.out.println("Computer wins!");
			}
			if (computerThrow == PAPER) {
				System.out.println("Player wins!");
			}
			if (computerThrow == SCISSORS) {
				System.out.println("It's a draw!");
			}
			break; 
 */

import java.util.Scanner;
import java.util.Random;

public class RPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ROCK = 1, PAPER = 2, SCISSORS = 3, LIZARD = 4, SPOCK = 5, end = 6;
		int playerThrow, computerThrow;
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out
				.print("Enter your throw (1 = rock, 2 = paper, 3 = scissors, 4 = lizard, 5 = spock): ");
		playerThrow = input.nextInt();

		computerThrow = rand.nextInt(5) + 1;

		// insert switch cases here

		while (playerThrow != end) {
			System.out.print("Player throws ");
			switch (playerThrow) {
			case ROCK:
				System.out.println("ROCK.");
				break;
			case PAPER:
				System.out.println("PAPER.");
				break;
			case SCISSORS:
				System.out.println("SCISSORS.");
				break;
			case LIZARD:
				System.out.println("LIZARD.");
				break;
			case SPOCK:
				System.out.println("SPOCK.");
				break;
			}
			System.out.print("Computer throws ");
			switch (computerThrow) {
			case ROCK:
				System.out.println("ROCK.");
				break;
			case PAPER:
				System.out.println("PAPER.");
				break;
			case SCISSORS:
				System.out.println("SCISSORS.");
				break;
			case LIZARD:
				System.out.println("LIZARD.");
				break;
			case SPOCK:
				System.out.println("SPOCK.");
				break;
			}

			if (playerThrow == ROCK) {
				if (computerThrow == ROCK) {
					System.out.println("It's a draw!");
				} else if (computerThrow == PAPER) {
					System.out.println("Computer wins!");
				} else if (computerThrow == SCISSORS) {
					System.out.println("Player wins!");
				} else if (computerThrow == LIZARD) {
					System.out.println("Player wins!");
				} else if (computerThrow == SPOCK) {
					System.out.println("Computer wins!");
				}
			}
			if (playerThrow == PAPER) {
				if (computerThrow == ROCK) {
					System.out.println("Player wins!");
				} else if (computerThrow == PAPER) {
					System.out.println("It's a draw!");
				} else if (computerThrow == SCISSORS) {
					System.out.println("Computer wins!");
				} else if (computerThrow == LIZARD) {
					System.out.println("Computer wins!");
				} else if (computerThrow == SPOCK) {
					System.out.println("Player wins!");
				}
			}
			if (playerThrow == SCISSORS) {
				if (computerThrow == ROCK) {
					System.out.println("Computer wins!");
				} else if (computerThrow == PAPER) {
					System.out.println("Player wins!");
				} else if (computerThrow == SCISSORS) {
					System.out.println("It's a draw!");
				} else if (computerThrow == LIZARD) {
					System.out.println("Player wins!");
				} else if (computerThrow == SPOCK) {
					System.out.println("Computer wins!");
				}
			}
			if (playerThrow == LIZARD) {
				if (computerThrow == ROCK) {
					System.out.println("Computer wins!");
				} else if (computerThrow == PAPER) {
					System.out.println("Player wins!");
				} else if (computerThrow == SCISSORS) {
					System.out.println("Computer wins!");
				} else if (computerThrow == LIZARD) {
					System.out.println("It's a tie!");
				} else if (computerThrow == SPOCK) {
					System.out.println("Player wins!");
				}
			}
			if (playerThrow == SPOCK) {
				if (computerThrow == ROCK) {
					System.out.println("Player wins!");
				} else if (computerThrow == PAPER) {
					System.out.println("Computer wins!");
				} else if (computerThrow == SCISSORS) {
					System.out.println("Player wins!");
				} else if (computerThrow == LIZARD) {
					System.out.println("Computer wins!");
				} else if (computerThrow == SPOCK) {
					System.out.println("It's a tie!");
				}
			}

			System.out
					.print("Enter your throw (1 = rock, 2 = paper, 3 = scissors, 4 = lizard, 5 = spock): ");
			playerThrow = input.nextInt();

			computerThrow = rand.nextInt(5) + 1;

			System.out.print("Player throws ");

		}
		if (playerThrow == end) {
			System.out.println("the game.");
			input.close();
		}
	}
}