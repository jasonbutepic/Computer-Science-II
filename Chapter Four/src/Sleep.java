import java.text.NumberFormat;
import java.util.Scanner;


public class Sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b_year, b_month, b_day, c_year, c_month, c_day, alive, slept;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your birthday: ");
		System.out.println("Year: ");
		b_year = input.nextInt();
		System.out.println("Month: ");
		b_month = input.nextInt();
		System.out.println("Day: ");
		b_day = input.nextInt();
		System.out.println("Enter the current date: ");
		System.out.println("Year: ");
		c_year = input.nextInt();
		System.out.println("Month: ");
		c_month = input.nextInt();
		System.out.println("Day: ");
		c_day = input.nextInt();
		input.close();
		
		alive = ((c_year - b_year) * 365) + ((c_month - b_month) * 30) + (c_day - b_day);
		slept = alive * 8;
		NumberFormat number = NumberFormat.getIntegerInstance();
		
		System.out.println("You have been alive for " + (number.format(alive)) + " days.");
		System.out.println("You have been asleep for " + (number.format(slept)) + " hours.");
	}

}
