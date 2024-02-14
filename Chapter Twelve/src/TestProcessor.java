import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class TestProcessor {
    public static void main(String[] args) {
        NumberFormat percent = NumberFormat.getPercentInstance();
        int correct = 0;
        Double grade;
        String scores, key = "", name = "";

        try {
            File scoreFile = new File("ProcessorScores.txt");
            Scanner input = new Scanner(scoreFile);
            key = input.nextLine();

            while (input.hasNext()) {
                name = input.nextLine();
                scores = input.nextLine();
                grade = 0.0;
                for (int i = 0; i < key.length(); i++) {
                    if (key.charAt(i) == scores.charAt(i)) {
                        correct += 1;
                    }
                }
                grade = (double) correct / key.length();
                System.out.println(name + " " + percent.format(grade));
                correct = 0;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
