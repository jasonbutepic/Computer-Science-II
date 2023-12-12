import java.util.Scanner;


public class Energy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mass, energy, LightBulbs;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the mass in kilograms: ");
		mass = input.nextDouble();
		input.close();
		
		//the equation is E = m * c ^ 2
		energy = mass * ((3.0 * 100000000) * (3.0 * 100000000));
		LightBulbs = energy / 360000;
		
		System.out.println("The energy produced in Joules is = " + energy);
		System.out.print("The number of 100-watt light bulbs powered = " + LightBulbs);
	}

}
