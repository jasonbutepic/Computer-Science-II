import java.text.NumberFormat;
import java.util.Scanner;

/*
 * Jason Robinson
 * 12/2/22
 * Project
 */

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double project_time, designing_min, coding_min, debugging_min, testing_min, designing_perc, coding_perc, debugging_perc, testing_perc;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the ammount of minutes you spent on designing: ");
		designing_min = input.nextDouble();
		System.out.println("Enter the ammount of minutes you spent on coding: ");
		coding_min = input.nextDouble();
		System.out.println("Enter the ammount of minutes you spent on debugging: ");
		debugging_min = input.nextDouble();
		System.out.println("Enter the ammount of minutes you spent on testing: ");
		testing_min = input.nextDouble();
		input.close();
		
		project_time = designing_min + coding_min + debugging_min + testing_min;
		designing_perc = (designing_min / project_time);
		coding_perc = (coding_min / project_time);
		debugging_perc = (debugging_min / project_time);
		testing_perc = (testing_min / project_time);
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		System.out.format("%-10s %-8s\n", "Task", "% Time");
		System.out.format("%-10s %-8s\n", "Designing", percent.format(designing_perc));
		System.out.format("%-10s %-8s\n", "Coding", percent.format(coding_perc));
		System.out.format("%-10s %-8s\n", "Debugging", percent.format(debugging_perc));
		System.out.format("%-10s %-8s\n", "Testing", percent.format(testing_perc));
	}

}
