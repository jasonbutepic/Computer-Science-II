import java.text.NumberFormat;
import java.util.Scanner;


public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int eggs;
		int dozen, extra;
		double price;
		
		System.out.println("Enter the number of eggs you want to buy: ");
		eggs = input.nextInt();
		
		dozen = eggs / 12;
		extra = eggs % 12;
		
		System.out.println("Dozen: " + dozen + " Extra: " + extra);
		
		if (dozen >= 11) {
			price = dozen * .35;
			price += extra * .35 / 12;
		} else if (dozen >= 6) {
			price = dozen * .40;
			price += extra * .4 / 12;
		} else if (dozen >= 4) {
			price = dozen * .45;
			price += extra * .45 / 12;
		} else {
			price = dozen * .50;
			price += extra * .5 / 12;
		}
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("The bill is equal to: " + (money.format(price)));
		
	}

}
