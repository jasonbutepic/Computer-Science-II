import java.util.Scanner;

public class IsoTriangle {
    
public static void main(String[] args) {
        int user;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to make an isosceles triangle: ");
        user = input.nextInt();

        for (int i = 1; i <= user; i++) {
            addSpaces(user - i);
            drawBar(i);
            System.out.println();
        }

}

public static void drawBar(int length) {
    for (int k = 1; k <= length * 2 - 1; k++) {
        System.out.print("*");
    }
}

public static void addSpaces(int length) {
    for (int j = 1; j <= length; j++) {
        System.out.print(" ");
    }
}

}




        /* for (int i = 1; i <= user; i++) {
            for (int j = 1; j <= user - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
