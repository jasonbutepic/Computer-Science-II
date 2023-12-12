import java.util.Scanner;

/*
 * Jason robinson
 * Stages
 * 12/15/22
 */
public class Stages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		age = input.nextInt();
		input.close();
		
		if (age > 18) {
			System.out.print("You're an adult");
		} else if (age > 12) {
			System.out.print("You're a teenager");
		} else if (age > 10) {
			System.out.print("You're a preteen");
		} else if (age > 5){
			System.out.print("You're a child");
		} else {
			System.out.print("You're a toddler");
		}
	}

}
