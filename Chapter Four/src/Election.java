import java.text.NumberFormat;
import java.util.Scanner;

/*
 * Jason robinson
 * Election
 * 12/2/22
 */
public class Election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int candidate_1, candidate_2; 
		double cand_1_perc, cand_2_perc;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the votes for the first candidate: ");
		candidate_1 = input.nextInt();
		System.out.println("Enter the votes for the second candidate: ");
		candidate_2 = input.nextInt();
		input.close();
		
		cand_1_perc = (candidate_1 / (candidate_1 + candidate_2));
		cand_2_perc = (candidate_2 / (candidate_1 + candidate_2));
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		System.out.format("%-20s %-10s %-12s\n", "Candidates", "Votes", "Percentage");
		System.out.format("%-20s %-10s %-12s\n", "First Candidate", candidate_1, percent.format(cand_1_perc));
		System.out.format("%-20s %-10s %-12s\n", "Second Candidate", candidate_2, percent.format(cand_2_perc));
	}

}
