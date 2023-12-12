import java.util.Scanner;

/*
 * Jason Robinson
 * 12/2/22
 * Simple Interest PART A
 */

public class Compound_Interest_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal, years, interest, value, compounded;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the future value of the investment: ");
		value = input.nextDouble();
		System.out.println("Enter the initial amount of money invested: ");
		principal = input.nextDouble();
		System.out.println("Enter the annual interest rate: ");
		interest = input.nextDouble();
		System.out.println("Enter the number of times that interest is compounded per year: ");
		compounded = input.nextDouble();
		input.close();
		
		years = (Math.log(value / principal)) / (compounded * (Math.log(1 + (interest / compounded))));
		
		System.out.print("The amount of years the money was invested was " + years);
	}

}
