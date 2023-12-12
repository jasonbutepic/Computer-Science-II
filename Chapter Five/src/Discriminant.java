import java.util.Scanner;

/*
 * Jason robinson
 * Discriminant
 * 12/19/22
 */
public class Discriminant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, dis;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of a: ");
		a = input.nextInt();
		System.out.println("Enter the value of b: ");
		b = input.nextInt();
		System.out.println("Enter the value of c: ");
		c = input.nextInt();
		input.close();
		
		dis = (int) (Math.pow(b, 2) - (4 * a * c));
		
		if (dis == 0) {
			System.out.print("One root.");
		} else if (dis < 0) {
			System.out.print("No roots.");
		} else if (dis > 0) {
			System.out.print("Two roots.");
	}
	}
}
