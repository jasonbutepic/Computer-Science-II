public class TernarySearch {
    public static void main(String[] args) {
        int[] items = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int goal = 13;
        int result = Searches.TernarySearch(items, 0, items.length - 1, goal);
        if (result == -1) {
            System.out.println("The goal " + goal + " was not found.");
        } else {
            System.out.println("The goal " + goal + " was found at index " + result + ".");
        }
    }
}
