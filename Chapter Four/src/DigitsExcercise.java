import java.util.Scanner;


public class DigitsExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w, x, y, z, a;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a three digit number you want the digits of: ");
		w = input.nextInt();
		input.close();
		
		a = (w / 1000) % 10;
		x = (w / 100) % 10;
		y = (w / 10) % 10;
		z = w % 10;
		
		System.out.print(a + " " + x + " " + y + " " + z);
	}

}
