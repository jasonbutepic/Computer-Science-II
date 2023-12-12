import java.util.Scanner;

public class HiLo {
    
public static void main(String[] args) {
    int points = 1000, guess, count = 0, risk;
    Scanner input = new Scanner(System.in);
    System.out.println("Rules: You start with 1000 points. You can risk any number of points. If you guess correctly, you win that many points. If you guess incorrectly, you lose that many points. The game ends when you run out of points. If a number is 1 to 6, it is considered low. If it is 8 to 13, it is considered high. If it is 7 then it is considered neither. Good luck!");
    do {
    System.out.println("You have " + points + " points.");
    System.out.println("Enter the points you want to risk: ");
    risk = input.nextInt();
    while (points < risk) {
        System.out.println("You don't have enough points. Enter the points you want to risk: ");
        risk = input.nextInt();
    }
    System.out.println("Enter your guess [1 = high, 0 = low]: ");
    guess = input.nextInt();
    while (guess != 1 && guess != 0) {
        System.out.println("Invalid guess. Enter your guess [1 = high, 0 = low]: ");
        guess = input.nextInt();
    }

    points = takeTurn(risk, guess, points);

    count++;

} while (points > 0);

System.out.println("You lost all your points in " + count + " rounds.");

}

public static int takeTurn(int risk, int guess, int points) {
    int number = (int) (Math.random() * 13) + 1;
    System.out.println("The number is " + number);
    if (guess == 1) {
        if (number > 7) {
            System.out.println("You won " + risk + " points.");
            return points + (risk * 2);
        } else {
            System.out.println("You lost " + risk + " points.");
            return points - risk;
        }
    } else {
        if (number < 7) {
            System.out.println("You won " + risk + " points.");
            return points + (risk * 2);
        } else {
            System.out.println("You lost " + risk + " points.");
            return points - risk;
        }
    }
}

}


