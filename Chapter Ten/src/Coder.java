

import java.util.Scanner;

public class Coder {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String phrase = input.nextLine();

            System.out.print("The coded string is: ");
            for (int i = 0; i < phrase.length(); i++){
                char letter = phrase.charAt(i);
                if (letter == ' '){
                    System.out.print(" ");
                } else if (letter == 'x'){
                    System.out.print("a");
                } else if (letter == 'y'){
                    System.out.print("b");
                } else {
                    System.out.print((char)(letter + 2));
                }
            }
    }
}