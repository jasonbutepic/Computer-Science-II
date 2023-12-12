import java.util.Random;
import java.util.Scanner;

public class MathTutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random_1, random_2, operator, equation_ans;
		double num, user_ans = 0;
		Random r = new Random();
		Scanner input = new Scanner(System.in);

		random_1 = r.nextInt(10 - 1 + 1) + 1;
		random_2 = r.nextInt(10 - 1 + 1) + 1;
		operator = r.nextInt(4 - 1 + 1) + 1;

		if (operator == 1) {
			user_ans = (int)user_ans;
			equation_ans = random_1 + random_2;
			System.out.println("What is " + random_1 + " + " + random_2 + "?");
			user_ans = input.nextInt();
			input.close();
			if (user_ans == equation_ans) {
				System.out.print("Correct!");
			} else {
				System.out.print("Incorrect! The correct answer was " + equation_ans);
			}

		} else if (operator == 2) {
			user_ans = (int)user_ans;
			equation_ans = random_1 - random_2;
			System.out.println("What is " + random_1 + " - " + random_2 + "?");
			user_ans = input.nextInt();
			input.close();
			if (user_ans == equation_ans) {
				System.out.print("Correct!");
			} else {
				System.out.print("Incorrect! The correct answer was " + equation_ans);
			}
			
		} else if (operator == 3) {
			user_ans = (int)user_ans;
			equation_ans = random_1 * random_2;
			System.out.println("What is " + random_1 + " * " + random_2 + "?");
			user_ans = input.nextInt();
			input.close();
			if (user_ans == equation_ans) {
				System.out.print("Correct!");
			} else {
				System.out.print("Incorrect! The correct answer was " + equation_ans);
			}
			
		} else if (operator == 4) {			
			num = (double) random_1 / (double) random_2;	
			
			System.out.println("What is " + random_1 + " / " + random_2 + "? (round to the hundreds place if necessary)");
			user_ans = input.nextDouble();
			input.close();
			
			num = num * 1000;	
			num = (int)num;		
				
			if(num % 10 > 4) {
				num += 10;	
			}
			
			num = num / 10;		
			num = (int)num;		
			num = num / 100;
			
			if (user_ans == num) {
				System.out.print("Correct!");
			} else {
				System.out.print("Incorrect! The correct answer was " + num);
			}
		}

	}
}
