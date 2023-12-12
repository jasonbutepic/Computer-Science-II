import java.util.Scanner;

/*
 * Jason robinson
 * Surf's Up
 * 12/9/22
 */
public class SurfsUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int waves;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the height of the waves in feet: ");
		waves = input.nextInt();
		input.close();

		if (waves >= 6) {
			System.out.print("Great day for surfing!");
		} else if (waves >= 3) {
			System.out.print("Go bodyboarding!");
		} else if (waves >= 0) {
			System.out.print("Go for a swim!");
		} else {
			System.out.print("Whoa! What kind of surf is that?");
		}
	}

}
