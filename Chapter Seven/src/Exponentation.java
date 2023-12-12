import java.util.Scanner;

public class Exponentation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, power;
        System.out.print("Enter the base: ");
        number = input.nextInt();
        System.out.print("Enter the exponent you want to raise the number to: ");
        power = input.nextInt();

        System.out.println(number + " raised to the power of " + power + " is " + powerOf(number, power));
    }

public static int powerOf(int number, int power) {
    int result = 1;
    for (int i = 0; i < power; i++) {
        result *= number;
    }
    return result;
}
    
}
