import java.util.Scanner;


public class AccountSetup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i;
		String name, password;
		boolean lowercase = false, uppercase = false, special = false;
		
		System.out.print("Enter what you want your username to be: ");
		name = input.nextLine();
		
		do {
			System.out.print("Enter what you want your password to be (must be at least 8 characters, have one special character, and have one uppercase and lowercase letter): ");
			password = input.nextLine();
			
				for (i = 0 ; i < password.length() ; i++) {
					if (password.charAt(i) >= 33 && password.charAt(i) <= 64) {
						special = true;
					}
					if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
						lowercase = true;
					}
					if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
						uppercase = true;
					}
				}
		} while (lowercase == false || uppercase == false || special == false || password.length() < 8);
		
		System.out.print("Your user name is " + name.toLowerCase() + " and your password is " + password);
		
	}

}
