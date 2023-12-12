/*
 * Jason Robinson
 * 10/28/22
 * Distance
 */

import java.util.*;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length1, length2, length3, totalLength;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of the first race: ");
		length1 = input.nextDouble();
		System.out.print("Enter the length of the second race: ");
		length2 = input.nextDouble();
		System.out.print("Enter the length of the third race: ");
		length3 = input.nextDouble();
		System.out.print("What is the runners name?: ");
		System.out.println("The runners name is " + input.next());
		input.close();
		
		totalLength = length1 + length2 + length3;
		
		System.out.print("The total distance of the race is " + totalLength + " kilometers");
	}

}
