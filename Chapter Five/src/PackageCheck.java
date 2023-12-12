import java.util.Scanner;

public class PackageCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length, weight, height, width, size;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter package weight in kilograms: ");
		weight = input.nextInt();
		System.out.println("Enter package length in centimeters: ");
		length = input.nextInt();
		System.out.println("Enter package width in centimeters: ");
		width = input.nextInt();
		System.out.println("Enter package height in centimeters: ");
		height = input.nextInt();
		input.close();

		size = length * width * height;

		if (weight > 27 && size > 100000) {
			System.out.print("Too heavy and too large.");
		} else if (weight > 27) {
			System.out.print("Too heavy.");
		} else if (size > 100000) {
			System.out.print("Too large.");
		} else {
			System.out.print("Accepted");
		}

	}
}
