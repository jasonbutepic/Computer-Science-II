import java.util.Scanner;


public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for loop that checks every character (charAt) for if its a vowel then add
		// or check each vowel for every instance idk man
		
		Scanner input = new Scanner(System.in);
		String phrase;
		int vowels = 0, i, letter;
		
		System.out.print("Enter a phrase: ");
		phrase = input.nextLine();
		
		for (i = 0 ; i < phrase.length() ; i++) {
			phrase = phrase.toLowerCase();
			letter = phrase.charAt(i);
			
			if (letter == 97 || letter == 101 || letter == 105 || letter == 111 || letter == 117) {
				vowels++;
			}
		}
		
		System.out.print("There are " + vowels + " vowels in the phrase you entered.");
		
	}

}
