import java.util.Scanner;

/*
 * Jason robinson
 * Temp converter
 * 11/9/22
 */
public class TempConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fahrenheit, celsius;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature in FAHRENHEIT: ");
		fahrenheit = input.nextDouble();
		input.close();
		
		celsius = 5.0 / 9.0 * (fahrenheit - 32);
		
		System.out.print("The temperature in celsius is " + celsius);
	}

}
