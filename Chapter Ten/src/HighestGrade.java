

import java.util.Scanner;
import java.util.ArrayList;

public class HighestGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<Integer>();
        int grade;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a grade: ");
            grade = input.nextInt();
            grades.add(grade);
        }

        int highest = grades.get(0);
        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) > highest) {
                highest = grades.get(i);
            }
        }

        System.out.println("The highest grade is " + highest + ".");
}
}