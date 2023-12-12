import java.util.Scanner;


public class FormalGreeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name;
		
		System.out.print("Enter your first name (including your title): ");
		name = input.nextLine();
		
		if (name.startsWith("Mr.")) {
			System.out.print("Hello, sir.");
		} else if (name.startsWith("Mrs.") || name.startsWith("Ms.") || name.startsWith("Miss")) {
			System.out.print("Hello, ma'am.");
		} else {
			System.out.print("Hello, " + name + ".");
		}
		
	}

}
