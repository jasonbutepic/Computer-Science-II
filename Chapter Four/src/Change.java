import java.util.Scanner;


public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quarter, dime, nickel, penny, change;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of change: ");
		change = input.nextInt();
		input.close();
		
		quarter = change / 25;
		dime = (change - quarter * 25) / 10;
		nickel = (change - (quarter * 25) - (dime * 10)) / 5;
		penny = (change - (quarter * 25) - (dime * 10) - (nickel * 5));

		
		System.out.println("The minimum number of coins is:");
		System.out.println("Quarters: " + quarter);
		System.out.println("Dimes: " + dime);
		System.out.println("Nickels: " + nickel);
		System.out.println("Pennies: " + penny);
	}

}
