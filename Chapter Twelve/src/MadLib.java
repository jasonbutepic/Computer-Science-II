import java.io.*;
import java.util.Scanner;

//add random function, make story take the entire file, check for # = noun and % = verb (for loop), 

public class MadLib {
    static String story;
    String verb;
    String noun1;
    String noun2;

    public static void main(String[] args) {
        
        try {
            File storyFile = new File("story.txt");
            Scanner input = new Scanner(storyFile);
            story = input.nextLine();

            while (input.hasNext()) {
                
            }
        } catch (IOException e) {
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
