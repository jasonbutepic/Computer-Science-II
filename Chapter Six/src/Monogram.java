import java.util.Scanner;


public class Monogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String first, middle, last;
		
		System.out.print("Enter your first name: ");
		first = input.nextLine();
		System.out.print("Enter your middle initial: ");
		middle = input.nextLine();
		System.out.print("Enter your last name:");
		last = input.nextLine();
		
		first = first.toLowerCase();
		middle = middle.toLowerCase();
		last = last.toUpperCase();
		
		System.out.print("Your monogram is: " + first.charAt(0) + last.charAt(0) + middle.charAt(0));
	}

}
