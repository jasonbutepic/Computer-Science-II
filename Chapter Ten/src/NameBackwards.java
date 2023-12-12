import java.util.Scanner;

public class NameBackwards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        char[] nameLetters = name.toCharArray();
        for (int i = nameLetters.length - 1; i >= 0; i--) {
            System.out.print(nameLetters[i]);
        }
}
}