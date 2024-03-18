public class Searches {

    /**
     * Searches items array for goal
     * pre: items is sorted from low to high
     * post: Position of goal has been returned,
     * or -1 has been returned if goal not found.
     */
    public static int binarySearch(int[] items, int start,
            int end, int goal) {
        if (start > end) {
            return (-1);
        } else {
            int mid = (start + end) / 2;
            if (goal == items[mid]) {
                return (mid);
            } else if (goal < items[mid]) {
                return (binarySearch(items, start, mid - 1, goal));
            } else {
                return (binarySearch(items, mid + 1, end, goal));
            }
        }
    }

    public static int ObjectBinarySort(Comparable[] items, int start,
            int end, Comparable goal) {
        if (start > end) {
            return (-1);
        } else {
            int mid = (start + end) / 2;
            if (goal.compareTo(items[mid]) == 0) {
                return (mid);
            } else if (goal.compareTo(items[mid]) < 0) {
                return (ObjectBinarySort(items, start, mid - 1, goal));
            } else {
                return (ObjectBinarySort(items, mid + 1, end, goal));
            }
        }
    }
}
