import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integer, int_root;
		double root, square;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the integer that you want to test: ");
		integer = input.nextInt();
		input.close();
		
		root = Math.sqrt(integer);
		int_root = (int) root;
		square = Math.pow(int_root, 2);	
		
		if (integer == square){
			System.out.print("The integer you entered (" + (int) integer + ") is a perfect square.");
		} else
			System.out.print("The integer you entered (" + (int) integer + ") is a NOT perfect square.");
	}

}
