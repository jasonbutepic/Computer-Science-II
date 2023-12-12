import java.util.Random;
import java.util.Scanner;


public class DiceRolls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int dice1, dice2, total;
		Random r = new Random();
		
		System.out.format("%-8s %-8s %-8s", "Dice 1", "Dice 2", "Total");
		
		for (int i = 0 ; i < 5 ; i++ ) {
			dice1 = r.nextInt(6 - 1 + 1) + 1;
			dice2 = r.nextInt(6 - 1 + 1) + 1;
			total = dice1 + dice2;
			System.out.format("\n %6s %8s %8s", dice1, dice2, total);
		}
	}

}
