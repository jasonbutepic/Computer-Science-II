import java.util.Scanner;

public class Prompter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int min, max, between;

		System.out.println("Enter the minimum value: ");
		min = input.nextInt();
		System.out.println("Enter the maximum value: ");
		max = input.nextInt();
		if (min >= max) {
			System.out.println("Make sure the minimum is less than the maximum.");
			System.out.println("Enter the minimum value: ");
			min = input.nextInt();
			System.out.println("Enter the maximum value: ");
			max = input.nextInt();
			if (min < max) {
				System.out.println("Enter a number between the minimum and maximum: ");
				between = input.nextInt();
				while (between < min || between > max && min < max) {
					System.out.println("Enter a number between the minimum and maximum: ");
					between = input.nextInt();
				}

				if (between >= min && between <= max) {
					System.out.println(between + " is between " + min + " and " + max);
				} 

			}
		}
	}
}