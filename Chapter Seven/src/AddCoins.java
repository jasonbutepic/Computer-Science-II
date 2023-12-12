import java.util.Scanner;

public class AddCoins {
    
public static void main(String[] args) {
        int quarters, dimes, nickels, pennies;
        double total;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of quarters: ");
        quarters = input.nextInt();
        System.out.print("Enter the number of dimes: ");
        dimes = input.nextInt();
        System.out.print("Enter the number of nickels: ");
        nickels = input.nextInt();
        System.out.print("Enter the number of pennies: ");
        pennies = input.nextInt();

        System.out.print("You have $" + getDollarAmount(quarters, dimes, nickels, pennies) + " in change.");
}

public static String getDollarAmount(int quarters, int dimes, int nickels, int pennies) {
    double total = quarters * 0.25 + dimes * 0.10 + nickels * 0.05 + pennies * 0.01;
    return String.format("%.2f", total);
}

}
