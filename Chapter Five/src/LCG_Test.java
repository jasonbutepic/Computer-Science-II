import java.util.ArrayList;

public class LCG_Test {

	public static void main(String[] args) {
		int modulus = 9873;
		int multiplier = 723;
		int increment = 9253;
		int seed = 6325;
		int newSeed;
		int period = 0;
		boolean isThere = false;
		
		ArrayList<Integer> randNumList = new ArrayList<Integer>();
		randNumList.add(seed);
		
		System.out.println(seed);
		
		do {
			period ++;
			newSeed = (seed * multiplier + increment) % modulus;
			System.out.println(newSeed);
			
			if (randNumList.indexOf(newSeed) < 0) {
				isThere = false;
			} else {
				isThere = true;
			}
			
			randNumList.add(newSeed);
			seed = newSeed;	
		
		} while (isThere == false);

		System.out.println("The period is: " + period);


	}

}


