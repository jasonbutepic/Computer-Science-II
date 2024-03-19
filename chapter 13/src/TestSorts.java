import java.util.Scanner;
public class TestSorts {


    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Charlie", "David", "Eve", "Frank", "Grace", "Heidi", "Ivan", "Judy"};

        int start = 0, end = names.length - 1;
        String goal;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name to search for: ");
        goal = input.nextLine();

        int result = Searches.binarySearch(names, start, end, goal);

        if (result == -1) {
            System.out.println("The name " + goal + " was not found.");
        } else {
            System.out.println("The name " + goal + " was found at index " + result);
        }
    }
}