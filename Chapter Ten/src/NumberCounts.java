
import java.util.Scanner;
public class NumberCounts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] counts = new int[10];

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        while (num > 0) {
            int digit = num % 10;
            counts[digit] += 1;
            num /= 10;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + ": " + counts[i]);
        }
}
}
