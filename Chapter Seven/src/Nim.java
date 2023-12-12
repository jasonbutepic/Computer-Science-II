import java.util.Scanner;

public class Nim {
    
    public static void main(String[] args) {

        int stones = (int) (Math.random() * 16) + 15;
        int turn = (int) (Math.random() * 2) + 1;
        int draw;
        System.out.println("There are " + stones + " stones.");
        while (stones > 0) {
            if (turn == 1) {
                draw = playerTurn(stones);
                stones -= draw;
                System.out.println("You drew " + draw + " stones.");
                System.out.println("There are " + stones + " stones.");
                turn = 2;
            } else {
                draw = computerTurn(stones);
                stones -= draw;
                System.out.println("The computer drew " + draw + " stones.");
                System.out.println("There are " + stones + " stones.");
                turn = 1;
            }
        }
        if (turn == 1) {
            System.out.println("You win!");
        } else {
            System.out.println("The computer wins!");
        }

    }

    public static boolean isValidEntry(int input)
    {
        if (input >= 1 && input <= 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int drawStones(int stones)
    {
        int draw = (int) (Math.random() * 3) + 1;
        if (draw > stones)
        {
            draw = stones;
        }
        return draw;
    }

    public static int computerTurn(int stones)
    {
        int draw = (int) (Math.random() * 3) + 1;
        if (draw > stones)
        {
            draw = stones;
        }
        return draw;
    }

    public static int playerTurn(int stones)
    {
        System.out.print("There are " + stones + " stones. How many would you like to draw? ");
        Scanner input = new Scanner(System.in);
        int draw = input.nextInt();
        while (isValidEntry(draw) == false)
        {
            System.out.print("Invalid entry. How many would you like to draw? ");
            draw = input.nextInt();
        }
        return draw;
    }
}
