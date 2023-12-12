import java.util.Scanner;


public class ProgrammingChallenge3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int user, i;
		
		System.out.print("Enter a number greater than 1: ");
		user = input.nextInt();
		
		while (user <= 1) {
			System.out.print("Enter a number GREATER than 1: ");
			user = input.nextInt();
		}
		
		for (i = 1; i <= user; i++){
			// multiples of 20: 20, 40, 60, 80, 100, etc
			if (i % 20 == 0){
				System.out.print((i - 2) + ", " + (i - 1) + ", ");
			}
		}
	}

}
