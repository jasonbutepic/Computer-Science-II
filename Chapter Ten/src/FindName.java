

import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number of names: ");
    int num = input.nextInt();
    String[] names = new String[num];

    for (int i = 0; i < names.length; i++) {
        System.out.println("Enter a name: ");
        names[i] = input.next();
    }

    System.out.println("Enter a name to search for: ");
    String name = input.next();
    int index = Search.linear(names, name);
    if (index == -1) {
        System.out.println("Name not found.");
    } else {
        System.out.println("Name found at index " + index + ".");
    }
}
}