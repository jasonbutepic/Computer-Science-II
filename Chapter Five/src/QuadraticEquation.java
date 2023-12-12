import java.util.Scanner;


public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a, b, c;
		double rootNeg, rootPos, discriminant;
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the value for a?: ");
		a = input.nextInt();
		System.out.println("What is the value for b?: ");
		b = input.nextInt();
		System.out.println("What is the value for c?: ");
		c = input.nextInt();
		input.close();
		
		discriminant = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
	
		if (discriminant >= 0) {
			
			rootPos = ((b * -1) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			rootNeg = ((b * -1) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			
			System.out.println("The roots are " + rootPos + " and " + rootNeg);
			
		} else {
			
			System.out.println("There are no roots.");
			
		}
	}

}
