import java.util.Scanner;

/*
 * Jason robinson
 * Digits
 * 11/9/22
 */
public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number you want the digits of: ");
		x = input.nextInt();
		input.close();
		
		y = x / 10;
		z = x % 10;
		
		System.out.print("The first digit of " + x + " is " + y + " and the second digit is " + z);
	}

}
