

import java.util.Scanner;
import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int outcome;
        int sum, numSides, numDice, numRolls;

        System.out.print("How many rolls? ");
        numRolls = input.nextInt();
        System.out.print("How many dice? ");
        numDice = input.nextInt();
        System.out.print("How many sides per die? ");
        numSides = input.nextInt();
        int[] outcomes = new int[numSides * numDice + 1];
        for (int j = 0; j < numRolls; j++) {
            sum = 0;

            //simulates one ‘roll’
            for (int i = 0; i < numDice; i++) {

                //simulates rolling one dice with numSides only once
                outcome = rand.nextInt(numSides) + 1;

                sum += outcome;  //sums each roll numDice times
            }
            outcomes[sum] += 1;	//increases element at index sum
        }

        /* show counts of outcomes */
        for (int i = numDice; i <= (numSides * numDice); i++) {
            System.out.println(i + ": " + outcomes[i]);
        }
        input.close();
    }
}
