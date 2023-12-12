import java.util.Scanner;

public class NewCarRecall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int model;

		System.out.print("Enter the model number of your car: ");
		model = input.nextInt();

		while (model != 0) {
			switch (model) {
			case 119:
			case 179:
			case 189:
			case 190:
			case 191:
			case 192:
			case 193:
			case 194:
			case 195:
			case 221:
			case 780:
				System.out.println("Your car is defective. It must be repaired.");
				break;
			default:
				System.out.println("Your car is not defective.");
				break;
			}
			
			System.out.print("Enter the model number of your car: (0 to quit) ");
			model = input.nextInt();
			
		}
		
		System.out.print("Goodbye.");

	}
}
