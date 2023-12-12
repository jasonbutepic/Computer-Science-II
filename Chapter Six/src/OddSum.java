import java.util.Scanner;


public class OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i, num, sum = 0;
		
		System.out.print("Enter the number you want to find the sum of the odds for: ");
		num = input.nextInt();
		
		for (i = 1 ; i <= num ; i++) {
			
			if (i % 2 != 0) {
				sum += i;
			}
			
		}
		
		System.out.println("The sum of the odd numbers between 1 and " + num + " is " + sum);
		
	}

}
