import java.util.Scanner;

/*
 * Jason robinson
 * Hurricane
 * 12/19/22
 */
public class Hurricane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int category;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the category of the hurricane: ");
		category = input.nextInt();
		input.close();
		
		switch (category) {
		case 1: System.out.println("Category 1: 74-95 mph or 64-82 kt or 119-153 km/hr"); break;
		case 2: System.out.println("Category 2: 96-110 mph or 83-95 kt or 154-177 km/hr"); break;
		case 3: System.out.println("Category 3: 111-130 mph or 96-113 kt or 178-209 km/hr"); break;
		case 4: System.out.println("Category 4: 131-155 mph or 114-135 kt or 210-249 km/hr"); break;
		case 5: System.out.println("Category 5: greater than 155 mph or 135 kt or 149 km/hr"); break;
		}
	}

}
