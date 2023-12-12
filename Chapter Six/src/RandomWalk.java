import java.util.Random;
import java.util.Scanner;


public class RandomWalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		int steps = 0, walk, dist = 0, high = 0, total = 0;
		Double average;
		
		for (int i = 0; i <= 50; i++) {
			
			steps = 0;
			dist = 0;
			
			do {
				walk = r.nextInt(1 - 0 + 1) + 0;
				if (walk == 0) {
					dist++;
				} else {
					dist--;
				}
				steps++;
			} while (dist > -3.5 && dist < 3.5);
			
			if (steps > high){
				high = steps;
			}
			
			total += steps;
			
		}
		
		average = (double) total / 50;
		
		System.out.print("The average amount of steps per trial was " + average + ", and the highest steps for one trial was " + high + ".");
		
	}

}
