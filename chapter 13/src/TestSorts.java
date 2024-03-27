import java.util.Scanner;
public class TestSorts {


    public static void main(String[] args) {
        String[] names = {"Heidi", "Frank", "Judy", "Eve", "Charlie", "Grace", "Alice", "Ivan", "David"};

        Sorts.selectionSort(names);

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