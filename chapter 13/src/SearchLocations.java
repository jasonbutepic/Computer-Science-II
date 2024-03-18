import java.util.Scanner;
import java.util.Random;

public class SearchLocations {
    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    public static void sortIntArray() {
        Scanner input = new Scanner(System.in);
        int numItems, searchNum, location;
        int[] test;
        Random rand = new Random();
        System.out.print("Enter number of elements: ");
        numItems = input.nextInt();
        /* populate and sort array */
        test = new int[numItems];
        for (int i = 0; i < test.length; i++) {
            test[i] = rand.nextInt(100);
        }
        Sorts.mergesort(test, 0, test.length - 1);
        System.out.println("Sorted:");
        displayArray(test);

        /* search for number in sorted array */
        System.out.print("Enter a number to search for: ");
        searchNum = input.nextInt();
        while (searchNum != -1) {
            location = Searches.binarySearch(test, 0,test.length - 1, searchNum);
            System.out.println("Number at position: " + location);
            System.out.print("Enter a number to search for (-1 to quit): ");
            searchNum = input.nextInt();
        }
    }

    public static void main(String[] args) {
        sortIntArray();
    }
}
