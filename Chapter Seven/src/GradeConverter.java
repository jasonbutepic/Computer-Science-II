import java.util.Scanner;

public class GradeConverter {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    int grade;
do {
    do {
        System.out.print("Enter a grade (-1 to quit): ");
        grade = input.nextInt();
    } while (isValid(grade) == false);
    if (grade == -1) {
        System.out.println("Goodbye!");
    } else {
        System.out.println("The grade " + grade + " is equivalent to a " + getLetterGrade(grade));
    }
} while (grade != -1);

}
 public static boolean isValid(int grade) {
     if (grade >= 0 && grade <= 100 || grade == -1) {
         return true;
     } else {
         return false;
     }
 }

 public static String getLetterGrade(int grade) {
    if (grade == 100) {
        return "A+";
    } else if (grade >= 90) {
        return "A";
    } else if (grade == 89) {
        return "B+";
    } else if (grade >= 80) {
        return "B";
    } else if (grade == 79) {
        return "C+";
    } else if (grade >= 70) {
        return "C";
    } else if (grade == 69) {
        return "D+";
    } else if (grade >= 60) {
        return "D";
    } else {
        return "F";
    }
 }
}
