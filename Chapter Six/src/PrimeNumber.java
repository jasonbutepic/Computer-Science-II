import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low, high, i;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		low = input.nextInt();
		System.out.print("Enter another number higher than the last one: ");
		high = input.nextInt();

		while (low >= high){
			System.out.println("Make sure the first number is lower than the second, and make sure they aren't the same.");
			System.out.print("Enter a number: ");
			low = input.nextInt();
			System.out.print("Enter another number higher than the last one: ");
			high = input.nextInt();
		}
		
		while (low < high) {
			boolean flag = false;
			for (i = 2; i <= low / 2; i++) {
				if (low % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag && low != 0 && low != 1) {
				System.out.print(low + " ");
			}

			low++;
		}
			/*
			 * System.out.print(
			 * "Enter a number to determine if it is prime or not: "); num =
			 * input.nextInt();
			 * 
			 * for (int i = 2; i <= num / 2; i++) { if (num % i == 0) { flag =
			 * true; break; } }
			 * 
			 * if (!flag) System.out.println(num + " is a prime number."); else
			 * System.out.println(num + " is not a prime number.");
			 */
	}
}
