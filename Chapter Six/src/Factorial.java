import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i, num, total = 1;

		System.out.print("Enter a number to use as a factorial that is greater than 1: ");
		num = input.nextInt();

		while (num < 1) {
			System.out.print("Enter a number greater than 1: ");
			num = input.nextInt();
		}
		if (num >= 1) {
			for (i = 1 ; i <= num ; i++) {

				total *= i;

			}

				System.out.println(num + "! is equal to " + total);

		}
	}

}
