import java.util.Scanner;

/*
 * Jason robinson
 * Delivery
 * 12/19/22
 */
public class Delivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length, width, height;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of the package: ");
		length = input.nextInt();
		System.out.println("Enter the width of the package: ");
		width = input.nextInt();
		System.out.println("Enter the height of the package: ");
		height = input.nextInt();
		input.close();
		
		if (length > 10 || width > 10 || height > 10) {
			System.out.print("Reject");
		} else
			System.out.print("Accept");
	}

}
