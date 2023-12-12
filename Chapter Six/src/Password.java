import java.util.Scanner;


public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String password = "password", guess;
		int i;
		
		System.out.print("Enter the password: ");
		guess = input.nextLine();
		
		for (i = 0 ; i < 2 ; i++) {			
			if (guess.compareTo(password) == 0) {
				System.out.print("Welcome.");
				break;
			} else {
				System.out.println("The password you entered is incorrect.");
			}
			
			System.out.print("Enter the password: ");
			guess = input.nextLine();
			
		}
		
		if (i == 2) {
			System.out.print("Access denied");
		}
		
	}

}
