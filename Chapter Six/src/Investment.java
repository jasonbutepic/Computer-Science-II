
public class Investment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double investment = (double) 2500;
		int year = 0;
		
		do {
			investment += (investment * 0.075);
			year++;
			
		} while (investment < 5000);
		
		System.out.print("It took " + year + " years for your investment (which was worth " + investment + " dollars) to be at least 5000 dollars and a 7.5% annual compound.");
	}

}
