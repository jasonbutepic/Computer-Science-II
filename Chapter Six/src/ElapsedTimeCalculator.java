import java.util.Scanner;

public class ElapsedTimeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int start, elapsed, i, zone = 0;
		String am_pm;

		do {
			System.out.print("Enter the starting hour: ");
			start = input.nextInt();
			System.out.print("Enter am (1) or pm (2): ");
			zone = input.nextInt();
			System.out.print("Enter the number of elapsed hours: ");
			elapsed = input.nextInt();
		} while (zone < 1 || zone > 2);
		
		for (i = 0; i <= elapsed - 1; i++) {
			if (start >= 12) {
				start = 0;
				if (zone == 1) {
					zone = 2;
				} else {
					zone = 1;
				}
			}
			start++;
		}
		
		if (start >= 12) {
			if (zone == 1) {
				zone = 2;
			} else {
				zone = 1;
			}
		}
		
		if (zone == 1) {
			am_pm = "AM";
		} else {
			am_pm = "PM";
		}
		
		
		
		System.out.print("The time is: " + start + ":00 " + am_pm);

		/*
		 * for (i = 0; i <= elapsed; i++) {
			start++;
			if (start >= 12) {
				start = 1;
				if (zone == 1) {
					zone = 2;
				} else {
					zone = 1;
				}
			}
		}

		if (zone == 1) {
			am_pm = "AM";
		} else {
			am_pm = "PM";
		}

		System.out.print("The time is: " + start + ":00 " + am_pm);
		
		__________________________________________________________________________________________
		
		if (tell == 1) {
			am_pm = "am";
		} else {
			am_pm = "pm";
		}
		
		zone = elapsed / 12;
		if (zone % 2 == 1) {
			if (am_pm.equals("am")) {
				am_pm = "pm";
			} else {
				am_pm = "am";
			}
		}
		
		end = start + elapsed % 12;
		
		System.out.print("The time is: " + end + ":00 " + am_pm);
		 */
	}

}
