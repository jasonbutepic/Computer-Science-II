
import java.util.Scanner;

public class EvensAndOdds {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int[] numbers = new int[25];
            int[] evens = new int[25];
            int[] odds = new int[25];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (int)(Math.random() * 100 + 1);
            }

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    evens[i] = numbers[i];
                } else {
                    odds[i] = numbers[i];
                }
            }

            System.out.println("ODDS:");
            for (int i = 0; i < odds.length; i++) { 
                 if (odds[i] != 0) {
                    System.out.print(odds[i] + " ");
                }
            }

            System.out.println("\nEVENS:");
            for (int i = 0; i < evens.length; i++) { 
                 if (evens[i] != 0) {
                    System.out.print(evens[i] + " ");
                }
            }
}
}