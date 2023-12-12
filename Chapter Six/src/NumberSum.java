import java.util.Scanner;

public class NumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num, count = 0, sum = 0;

		System.out.print("Enter a number greater than 1: ");
		num = input.nextInt();

		while (num < 1) {
			System.out.print("Enter a number greater than 1: ");
			num = input.nextInt();
		}
		if (num >= 1) {
			while (count < num) {
				count += 1;

				sum += count;

				System.out.println(count);
			}

			if (count == num) {
				System.out.println("The sum of these numbers is " + sum);
			}

		}
	}

}
