import java.util.Scanner;

public class MetricConversion {

    public static void main(String[] args) {
        double user;
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to convert: ");
        user = input.nextInt();
        System.out.print("Enter a number to pick your conversion: ");
        System.out.print("1. Inches to Centimeters\n2. Feet to Centimeters\n3. Yards to Meters\n4. Miles to Kilometers\n5. Centimeters to Inches\n6. Centimeters to Feet\n7. Meters to Yards\n8. Kilometers to Miles\n");

        do {
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
        } while (choice < 1 || choice > 8);

        if (choice == 1) {
            System.out.println(user + " inches is " + inchesToCentimeters(user) + " centimeters.");
        } else if (choice == 2) {
            System.out.println(user + " feet is " + feetToCentimeters(user) + " centimeters.");
        } else if (choice == 3) {
            System.out.println(user + " yards is " + yardsToMeters(user) + " meters.");
        } else if (choice == 4) {
            System.out.println(user + " miles is " + milesToKilometers(user) + " kilometers.");
        } else if (choice == 5) {
            System.out.println(user + " centimeters is " + centimetersToInches(user) + " inches.");
        } else if (choice == 6) {
            System.out.println(user + " centimeters is " + centimetersToFeet(user) + " feet.");
        } else if (choice == 7) {
            System.out.println(user + " meters is " + metersToYards(user) + " yards.");
        } else if (choice == 8) {
            System.out.println(user + " kilometers is " + kilometersToMiles(user) + " miles.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private static double kilometersToMiles(double user) {
        double miles = user * 0.621371;
        return miles;
    }

    private static double metersToYards(double user) {
        double yards = user * 1.09361;
        return yards;
    }

    private static double centimetersToFeet(double user) {
        double feet = user * 0.0328084;
        return feet;
    }

    private static double centimetersToInches(double user) {
        double inches = user * 0.393701;
        return inches;
    }

    private static double milesToKilometers(double user) {
        double kilometers = user * 1.60934;
        return kilometers;
    }

    private static double yardsToMeters(double user) {
        double meters = user * 0.9144;
        return meters;
    }

    private static double feetToCentimeters(double user) {
        double centimeters = user * 30.48;
        return centimeters;
    }

    private static double inchesToCentimeters(double user) {
        double centimeters = user * 2.54;
        return centimeters;
    }
    
}
