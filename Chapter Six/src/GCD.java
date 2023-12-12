import java.util.Scanner;


public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int temp = 0, num1, num2;
		
		System.out.print("Enter a number: ");
		num1 = input.nextInt();
		System.out.print("Enter another number: ");
		num2 = input.nextInt();
		
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0){
				temp = i;
			}
		}
		System.out.print("GCD is " + temp);
	}

}
