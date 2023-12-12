
import java.util.Scanner;

public class StudentRoster {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of students: ");
    int numStudents = input.nextInt();
    String[] names = new String[numStudents];
    System.out.println("Enter the names of the students: ");
    for (int i = 0; i < numStudents; i++) {
        names[i] = input.next();
    }

    System.out.println("Student Roster");
    for (int i = 0; i < numStudents; i++) {
        System.out.println(names[i]);
    }
}}
