

import java.util.Scanner;

public class RandomStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number = new int[10];

        for (int i = 0; i <= 500; i++){
            int random = (int) (Math.random() * 10);
            number[random] += 1;
        }

        System.out.println("Number\t\tOccurrences");
        for (int i = 0; i < number.length; i++){
            System.out.println(i + "\t\t\t" + number[i]);
        }
}
}