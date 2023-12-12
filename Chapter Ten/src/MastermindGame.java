
import java.util.Random;

public class MastermindGame extends Mastermind{
    
    private int[] code;
    private int numPegs;
    private int numColors;

    public MastermindGame(int numPegs, int numColors) {
        this.numPegs = numPegs;
        this.numColors = numColors;
        this.code = new int[numPegs];
        Random rand = new Random();
        for (int i = 0; i < numPegs; i++) {
            this.code[i] = rand.nextInt(numColors) + 1;
        }
    }
    
    public int[] checkGuess(int[] guess) {
        int[] result = new int[2];
        int[] codeCopy = new int[numPegs];
        int[] guessCopy = new int[numPegs];
        for (int i = 0; i < numPegs; i++) {
            codeCopy[i] = code[i];
            guessCopy[i] = guess[i];
        }
        for (int i = 0; i < numPegs; i++) {
            if (codeCopy[i] == guessCopy[i]) {
                result[0]++;
                codeCopy[i] = -1;
                guessCopy[i] = -2;
            }
        }
        for (int i = 0; i < numPegs; i++) {
            for (int j = 0; j < numPegs; j++) {
                if (codeCopy[i] == guessCopy[j]) {
                    result[1]++;
                    codeCopy[i] = -1;
                    guessCopy[j] = -2;
                }
            }
        }
        return result;
    }

}