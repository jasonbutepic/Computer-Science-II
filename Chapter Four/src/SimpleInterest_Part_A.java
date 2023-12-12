import java.text.NumberFormat;
import java.util.Scanner;

/*
 * Jason Robinson
 * 12/2/22
 * Simple Interest
 */

public class SimpleInterest_Part_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal, years, interest, value;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the principal: ");
		principal = input.nextDouble();
		System.out.println("Enter the years: ");
		years = input.nextDouble();
		System.out.println("Enter the interest: ");
		interest = input.nextDouble();
		input.close();
		
		value = principal * (1 + years * interest);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.print("The value after the term is " + money.format(value));
	}

}
