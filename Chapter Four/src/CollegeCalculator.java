import java.text.NumberFormat;
import java.util.Scanner;
/*
 * Jason Robinson
 * 11/17/22
 * College Calculator
 */

public class CollegeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double costs, offsets, totalCost;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much money did you spend on tuition and fees?");
		costs = input.nextDouble();
		System.out.println("How much money did you spend on books and supplies?");
		costs += input.nextDouble();
		System.out.println("How much money did you spend on housing/rent?");
		costs += input.nextDouble();
		System.out.println("How much money did you spend on food");
		costs += input.nextDouble();
		System.out.println("How much money did you spend on transportation?");
		costs += input.nextDouble();
		System.out.println("How much money did you spend on entertainment?");
		costs += input.nextDouble();
		System.out.println("How much money did you spend on other expenses?");
		costs += input.nextDouble();
		System.out.println("How much money did you get in scholarships?");
		offsets = input.nextDouble();
		input.close();
		
		totalCost = costs - offsets;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.print("You spent " + (money.format(costs)) + " and saved " + (money.format(offsets)) + ", bringing your total cost to " + (money.format(totalCost)));
	}

}
