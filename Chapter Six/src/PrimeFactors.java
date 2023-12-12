import java.util.Scanner;


public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int prime;
		
		System.out.print("Enter a number to find the prime factors of: ");
		prime = input.nextInt();
		
		for (int i = 2; i <= prime; i++){
			while (prime % i == 0) {
				System.out.println(i);
				prime /= i;
			}
		}
		
	}

}
