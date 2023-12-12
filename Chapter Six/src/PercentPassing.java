import java.text.NumberFormat;
import java.util.Scanner;


public class PercentPassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int grade, scores = 0, passing = 0, flag = -1;
		double above;
		
		System.out.print("Enter a grade from 0% to 100% (Enter -1 to stop): ");
		grade = input.nextInt();
		
		while (grade != flag) {
			
			scores += 1;
			
			if (grade >= 70) {
				passing += 1;
			}
			
			System.out.print("Enter a grade from 0% to 100% (Enter -1 to stop): ");
			grade = input.nextInt();
			
		}
		
		above = (double) passing / (double) scores;
		
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		System.out.print("You had " + scores +  " total grades and " + passing + " were passing (above 70%), which means that "  + percent.format(above) + " of them were passing.");
		
	}

}
