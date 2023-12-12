
public class ProgrammingChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		// Multiples of 4: 4,8,12,16,20,24,28,32,36,40,44,48,52,56,60,64,68,72,76,80,84,88,92,96,100
		// Multiples of 6: 0,6,12,18,24,30,36,42,48,54,60,66,72,78,84,90,96
		// Multiples of 4 and 6: 12,24,36,48,60,72,84,96
		
		System.out.println("Multiples of 4 that are not multiples of 6:");
		
		for (i = 0; i * 4 <= 100; i++) {
			
			if (i * 4 % 12 != 0) {
				System.out.print(i * 4 + ", ");
			}
			
		}
		
		System.out.println("");
		
		System.out.println("Multiples of 6 that are not multiples of 4:");
		
		for (i = 0; i * 6 <= 100; i++) {
			
			if (i * 6 % 12 != 0) {
				System.out.print(i * 6 + ", ");
			}
			
		}
		
	}

}
