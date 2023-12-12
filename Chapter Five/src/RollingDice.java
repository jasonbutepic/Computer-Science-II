import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;


public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice1, dice2, sum;
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		
		dice1 = r.nextInt(6 - 1 + 1) + 1;
		dice2 = r.nextInt(6 - 1 + 1) + 1;
		sum = dice1 + dice2;
		
		System.out.println("The first dice was " + dice1);
		System.out.println("The second dice was " + dice2);
		System.out.println("The sum is " + sum);
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		if (sum == 2) {
			System.out.println("The probability of rolling a " + sum + " is 2.778%");
		} else if (sum == 3) {
			System.out.println("The probability of rolling a " + sum + " is 5.556%");
		} else if (sum == 4) {
			System.out.println("The probability of rolling a " + sum + " is 8.333%");
		} else if (sum == 5) {
			System.out.println("The probability of rolling a " + sum + " is 11.111%");
		} else if (sum == 6) {
			System.out.println("The probability of rolling a " + sum + " is 13.889%");
		} else if (sum == 7) {
			System.out.println("The probability of rolling a " + sum + " is 16.667%");
		} else if (sum == 8) {
			System.out.println("The probability of rolling a " + sum + " is 13.889%");
		} else if (sum == 9) {
			System.out.println("The probability of rolling a " + sum + " is 11.111%");
		} else if (sum == 10) {
			System.out.println("The probability of rolling a " + sum + " is 8.333%");
		} else if (sum == 11) {
			System.out.println("The probability of rolling a " + sum + " is 5.556%");
		} else if (sum == 12) {
			System.out.println("The probability of rolling a " + sum + " is 2.778%");
		}
		
	}

}
