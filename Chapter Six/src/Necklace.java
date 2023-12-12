import java.util.Scanner;

public class Necklace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1, num2, start1 = 0, start2 = 0, steps = 0, print1 = 0, print2 = 0, high = 0, sum;

		for (num1 = 0 ; num1 < 10 ; num1++) {
			
			start1 = num1;
			
			for (int i = 0 ; i < 10 ; i++) {
				
				num2 = i;
				start2 = num2;
				steps = 0;
				
				steps = countNecklace(num1, num2);
				
				System.out.println("Num1: " + num1 + " Num2: " + num2 + " Steps: " + steps);
				
				if (steps > high){
					print1 = num1;
					print2 = num2;
					high = steps;
				}
			}
		}
		
		
		System.out.println("The highest number of steps was " + high + " which came from " + print1 + " and " + print2);

	}

	public static int countNecklace (int num1, int num2) {
		int start1 = num1, start2 = num2, steps = 0, sum;
		
		do {
			sum = (num1 + num2) % 10;
			num1 = num2;
			num2 = sum;
			steps++;
		} while (num1 != start1 || num2 != start2);
		
		return steps;

}}
