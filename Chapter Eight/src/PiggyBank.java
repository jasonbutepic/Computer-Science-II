import java.text.NumberFormat;
import java.util.Scanner;

public class PiggyBank {
    private double total;
    NumberFormat money = NumberFormat.getCurrencyInstance();
    Scanner input = new Scanner(System.in);

    public double getTotal() {
        return total;
    }

    public void addPenny(int pennies) {
        total = total + (pennies * 0.01);
    }

    public void addNickel(int nickels) {
        total = total + (nickels * 0.05);
    }

    public void addDime(int dimes) {
        total = total + (dimes * 0.10);
    }

    public void addQuarter(int quarters) {
        total = total + (quarters * 0.25);
    }

    public void takeMoney(double take) {
        total -= take;
    }

    public String toString() {
        String information = ("The total in the bank is " + total);
        return information;
    }
}
