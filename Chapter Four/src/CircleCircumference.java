import java.util.Scanner;

/*
 * Jason Robinson
 * Circle Circumference
 * 11/10/22
 */

public class CircleCircumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius, circumference;
		final double PI = 3.14;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle: ");
		radius = input.nextInt();
		input.close();
						
		if (radius < 0) {
			System.out.println("Negative radii are illegal");
		} else {
			circumference = 2 * PI * radius;
			System.out.println("The circumference of the circle is " + circumference);
		}
	}

}
