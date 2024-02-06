import java.util.Scanner;
import java.io.*;

public class Stats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0, lineCounter = 0;
        Double high = Double.MIN_VALUE, low = Double.MAX_VALUE;
        FileReader in;
        BufferedReader readFile;
        FileWriter out;
        BufferedWriter writeFile;
        String scores;

            System.out.println("Enter a name for the file: ");
            String fileName = input.nextLine();
            System.out.println("Enter the number of scores: ");
            int numScores = input.nextInt();

        try {
            out = new FileWriter(fileName);
            writeFile = new BufferedWriter(out);
            for (int i = 0; i < numScores; i++) {
                System.out.println("Enter a name: ");
                String name = input.next();
                System.out.println("Enter a score: ");
                int score = input.nextInt();
                writeFile.write(name);
                writeFile.newLine();
                writeFile.write(String.valueOf(score));
                writeFile.newLine();
            }
            writeFile.close();
            out.close();
            
            File scoreFile = new File(fileName);

            in = new FileReader(scoreFile);
            readFile = new BufferedReader(in);
            while ((scores = readFile.readLine()) != null) {
                lineCounter++;
                System.out.println(scores);
                if (lineCounter % 2 == 0) {
                    total += Integer.parseInt(scores);
                    if (Integer.parseInt(scores) > high) {
                        high = Double.parseDouble(scores);
                    }
                    if (Integer.parseInt(scores) < low) {
                        low = Double.parseDouble(scores);
                    }
                }
            }

            double avg = total / (lineCounter / 2);
            System.out.println("High: " + high);
            System.out.println("Low: " + low);
            System.out.println("Average: " + avg);
            readFile.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
