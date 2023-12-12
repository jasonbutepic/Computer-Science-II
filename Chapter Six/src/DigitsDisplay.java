import java.util.Scanner;


public class DigitsDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integer, i, output, print, counter = 1, length;
		String digits;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive integer to display the digits of: ");
		integer = input.nextInt();
		
		while (integer < 0) {
			System.out.print("Enter a POSITIVE integer to display the digits of: ");
			integer = input.nextInt();
		}

		digits = Integer.toString(integer);
		
		for (i = 0; i <= digits.length() - 1; i++){
			System.out.println(digits.charAt(i));
		}
		
	/*	
	1st		a = (w / 1000) % 10;
	2nd		x = (w / 100) % 10;
	3rd		y = (w / 10) % 10;
	4th		z = w % 10;
	
	Doesn't work:
	System.out.println((integer / (Math.pow(10, digits.length()))) % 10);
	
	if (integer % 2 == 0){
				System.out.print(integer + " is even ");
				integer /= 10;
			} else {
				System.out.print(integer + " is odd ");
				integer /= 10;
			}
	*/

	}

}
