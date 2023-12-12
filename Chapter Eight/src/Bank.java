import java.util.Scanner;
import java.text.NumberFormat;

public class Bank {
    public static void main(String[] args) {
		Account munozAccount = new Account(250, "Maria", "Munoz", "110 Glades Road", "Mytown", "FL", "33445");
		Scanner input = new Scanner(System.in);
		double data;
		System.out.println("\n");
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.println(munozAccount + "\n");
		
		System.out.print("Enter deposit amount: ");
		data = input.nextDouble();
		munozAccount.deposit(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));

		System.out.print("Enter withdrawal amount: ");
		data = input.nextDouble();
		munozAccount.withdrawal(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));		

		System.out.println("Woudl you like to change your address? (y/n)");
		String answer = input.next();
		if (answer.equals("y")) {
			munozAccount.changeAddress(munozAccount.toString());
		} else {
			System.out.println("Goodbye.");
		}
}}

