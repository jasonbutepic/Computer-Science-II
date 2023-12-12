import java.util.Scanner;

public class ProgrammingChallenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int alt1 = 0, alt2 = 0, sum = 0, height;

		System.out.print("Enter the height (-1 to stop): ");
		alt1 = input.nextInt();

		do {
			System.out.print("Enter the height (-1 to stop): ");
			alt2 = input.nextInt();
			
			if (alt2 != -1) {
				height = Math.abs(alt1 - alt2);
				sum += height;
				alt1 = alt2;
				System.out.println("The level changed by " + height);
			}
			
		} while (alt2 != -1);
		
		System.out.print("The total height changes by " + sum);
	}

}
