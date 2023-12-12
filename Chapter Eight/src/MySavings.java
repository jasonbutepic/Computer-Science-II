import java.text.NumberFormat;
import java.util.Scanner;

public class MySavings {
    public static void main(String[] args) {
        int choice, pennies, nickels, dimes, quarters; 
        Scanner input = new Scanner(System.in);
        PiggyBank myBank = new PiggyBank();
        NumberFormat money = NumberFormat.getCurrencyInstance();

        System.out.println("1. Show total in bank");
        System.out.println("2. Add a penny.");
        System.out.println("3. Add a nickel.");
        System.out.println("4. Add a dime.");
        System.out.println("5. Add a quarter.");
        System.out.println("6. Take money out of the bank.");
        System.out.println("Enter 0 to quit.");
        System.out.println("Enter your choice:");
        choice = input.nextInt();

        while (choice != 0) {
            if (choice == 1) {
                System.out.println("Total in bank is: " + money.format(myBank.getTotal()));
            } else if (choice == 2) {
                System.out.println("How many pennies do you want to add?");
                pennies = input.nextInt();
                myBank.addPenny(pennies);
            } else if (choice == 3) {
                System.out.println("How many nickels do you want to add?");
                nickels = input.nextInt();
                myBank.addNickel(nickels);
            } else if (choice == 4) {
                System.out.println("How many dimes do you want to add?");
                dimes = input.nextInt();
                myBank.addDime(dimes);
            } else if (choice == 5) {
                System.out.println("How many quarters do you want to add?");
                quarters = input.nextInt();
                myBank.addQuarter(quarters);
            } else if (choice == 6) {
                System.out.print("How much money do you want to take out?");
                double take = input.nextDouble();
                myBank.takeMoney(take);
            } else if (choice == 0) {
                System.out.println("Goodbye.");
            } else {
                System.out.println("Invalid choice.");
            }
            System.out.println("1. Show total in bank");
            System.out.println("2. Add a penny.");
            System.out.println("3. Add a nickel.");
            System.out.println("4. Add a dime.");
            System.out.println("5. Add a quarter.");
            System.out.println("6. Take money out of the bank.");
            System.out.println("Enter 0 to quit.");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
        }
    }
}
