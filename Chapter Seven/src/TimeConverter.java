import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int choice;

		System.out.println("Enter your choice for conversion:");
		System.out.println("1. Hours to minutes");
		System.out.println("2. Days to hours");
		System.out.println("3. Minutes to hours");
		System.out.println("4. Hours to days");

		choice = input.nextInt();
		do {
			switch (choice) {
				case 1:
					hoursToMinutes();
					break;
				case 2:
					daysToHours();
					break;
				case 3:
					minutesToHours();
					break;
				case 4:
					hoursToDays();
					break;
				default:
					System.out.println("Please pick a number from 1 to 4");
			}
		} while (choice > 4 || choice < 1);
	}

	public static void hoursToMinutes() {
		Scanner input = new Scanner(System.in);
		int hours, minutes;
		System.out.print("How many hours are you converting?: ");
		hours = input.nextInt();
		minutes = hours * 60;
		System.out.print("The amount of minutes from " + hours + " hours is "
				+ minutes + " minutes.");
	}

	public static void daysToHours() {
		Scanner input = new Scanner(System.in);
		int days, hours;
		System.out.print("How many days are you converting?: ");
		days = input.nextInt();
		hours = days * 24;
		System.out.print("The amount of hours from " + days + " days is "
				+ hours + " hours.");
	}

	public static void minutesToHours() {
		Scanner input = new Scanner(System.in);
		int hours, minutes;
		System.out.print("How many minutes are you converting?: ");
		minutes = input.nextInt();
		hours = minutes / 60;
		System.out.print("The amount of hours from " + minutes + " minutes is "
				+ hours + " hours.");
	}

	public static void hoursToDays() {
		Scanner input = new Scanner(System.in);
		int hours, days;
		System.out.print("How many hours are you converting?: ");
		hours = input.nextInt();
		days = hours / 24;
		System.out.print("The amount of days from " + hours + " hours is "
				+ days + " days.");
	}
}
