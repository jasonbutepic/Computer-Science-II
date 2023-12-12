

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        final int low = 'a';
        final int high = 'z';
        Scanner input = new Scanner(System.in);
        int[] letterCounts = new int[high - low + 1];
        char[] wordLetters;
        int offset;
        
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {
            wordLetters = str.toLowerCase().toCharArray();
            offset = wordLetters[i] - low;
            if (offset >= 0 && offset < letterCounts.length) {
                letterCounts[offset] += 1;
            }
        }

        for (int i = 0; i < letterCounts.length; i++) {
            System.out.println((char) (i + low) + ": " + letterCounts[i]);
        }
}
}