import java.io.*;
import java.util.Scanner;

public class MyFile {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);

        File MyFile = new File("zzz.txt");
        System.out.println(MyFile + " has been created.");

        System.out.println("Do you want to keep it? (Y/N)");
        String answer = input.nextLine();

        try {
            MyFile.createNewFile();
            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("File kept.");
            } else {
                MyFile.delete();
                System.out.println("File deleted.");
            }
        } catch (IOException e) {
            System.out.println("File could not be created.");
            System.err.println("IOException: " + e.getMessage());
        }
        
        /* 
        System.out.print("Enter a file: ");
        File textFile = new File(input.nextLine());

        if (textFile.exists()) {
            System.out.println("File already exists.");
        } else {
            try {
                textFile.createNewFile();
                System.out.println("File created.");
            } catch (IOException e) {
                System.out.println("File could not be created.");
                System.err.println("IOException: " + e.getMessage());
            }
        }
        */
    }

}
