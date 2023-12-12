import java.text.NumberFormat;
import java.util.Scanner;


public class CarPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal, interest, monthly, payment;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Principal: ");
		principal = input.nextDouble();
		System.out.println("Interest Rate: ");
		interest = input.nextDouble();
		System.out.println("Number of monthly payments: ");
		monthly = input.nextDouble();
		
		payment = (principal * (interest / 12)) / (1 - Math.pow(1 + interest / 12, monthly * -1));
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("The monthly payment is " + (money.format(payment)));
	}

}
