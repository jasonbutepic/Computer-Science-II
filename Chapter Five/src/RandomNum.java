import java.util.Random;
import java.util.Scanner;

/*
 * Jason robinson
 * Random Number
 * 12/19/22
 */
public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min, max, random;
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the lowest random number you want: ");
		min = input.nextInt();
		System.out.println("Enter the highest random number you want: ");
		max = input.nextInt();
		input.close();
		
		random = r.nextInt(max - min + 1) + min;
		
		System.out.print("Your number is " + random);
	}

}
