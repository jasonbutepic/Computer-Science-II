import java.util.Scanner;
/*
 * Jason Robinson
 * 11/17/22
 * Object Height
 */

public class ObjectHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height, time;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a time under 4.5 seconds: ");
		time = input.nextDouble();
		input.close();
		
		height = 100 - 4.9 * (time * time);
		
		System.out.print("The height of the object is  " + height + " meters");
	}

}
