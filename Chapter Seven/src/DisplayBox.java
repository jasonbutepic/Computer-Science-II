import java.util.Scanner;


public class DisplayBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int height, width;
		String check, draw;
		System.out.print("Enter a height for the box: ");
		height = input.nextInt();
		System.out.print("Enter a width for the box: ");
		width = input.nextInt();
		System.out.print("Do you want to use a custom character for the box? (enter y for yes): ");
		check = input.next();
		
		if (check.equals("y")) {
			
			do {
			System.out.print("Which character? (one character max)");
			draw = input.next();
			} while (draw.length() > 1);
			
			drawBox(height, width, draw);
			
		} else {
		
			drawBox(height, width);
			
		}
		
		
		
	}

	public static void drawBox(int repeat, int length, String symbol) {
		for (int i = 0 ; i < repeat ; i++){
			drawBar(length, symbol);
		}
	}
	
	public static void drawBox(int repeat, int length) {
		for (int i = 0 ; i < repeat ; i++){
			drawBar(length);
		}
	}
	
    public static void drawBar(int length, String draw) {
		for (int i = 0 ; i < length ; i++) {
			System.out.print(draw);
		}
		System.out.println();
	}
    
    public static void drawBar(int length) {
		for (int i = 0 ; i < length ; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}

/*
 * if (check.equals("y")) {
			do {
			System.out.print("Which character?");
			draw = input.next();
			} while (draw.length() > 1);
		} else {
			draw = "*";
		}
		
		drawBox(height, width, draw);
		
		
	}

	public static void drawBox(int repeat, int length, String symbol) {
		for (int i = 0 ; i < repeat ; i++){
			drawBar(length, symbol);
		}
	}
	
    public static void drawBar(int length, String draw) {
		for (int i = 0 ; i < length ; i++) {
			System.out.print(draw);
		}
		System.out.println();
	}
	
}
*/
