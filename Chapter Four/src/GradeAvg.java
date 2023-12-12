import java.text.NumberFormat;
import java.util.Scanner;

/*
 * Jason Robinson
 * Grade Average
 * 11/10/22
 */

public class GradeAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double average = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first grade: ");
		average += input.nextDouble();
		System.out.println("Enter the second grade: ");
		average += input.nextDouble();
		System.out.println("Enter the third grade: ");
		average += input.nextDouble();
		System.out.println("Enter the fourth grade: ");
		average += input.nextDouble();
		System.out.println("Enter the fifth grade: ");
		average += input.nextDouble();
		input.close();
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		average /= 5;
		average /= 100;
		
		System.out.print("The average of the grades is " + percent.format(average));
	}

}
