import java.text.NumberFormat;
import java.util.Scanner;

/*
 * Jason Robinson
 * 12/2/22
 * Simple Interest PART A
 */

public class Compound_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal, years, interest, value, compounded;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the future value of the investment: ");
		value = input.nextDouble();
		System.out.println("Enter the number of years money was invested: ");
		years = input.nextDouble();
		System.out.println("Enter the annual interest rate: ");
		interest = input.nextDouble();
		System.out.println("Enter the number of times that interest is compounded per year: ");
		compounded = input.nextDouble();
		input.close();
		
		principal = value / Math.pow((1 + (interest / compounded)), (compounded * years));
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.print("The initial deposit value was " + money.format(principal));
	}

}
