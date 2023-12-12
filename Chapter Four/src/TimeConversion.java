import java.util.Scanner;

/*
 * Jason Robinson
 * Time Conversion
 * 11/28/2022
 */

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minutes_1, minutes_2, hours, leftover;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an ammount of time in minutes:");
		final int minutes = input.nextInt();
		input.close();
		
		hours = minutes / 60;
		leftover = minutes % 60;
		minutes_1 = leftover / 10;
		minutes_2 = leftover % 10;
		
		System.out.print("The ammount of time is " + hours + ":" + minutes_1 + minutes_2);
	}

}
