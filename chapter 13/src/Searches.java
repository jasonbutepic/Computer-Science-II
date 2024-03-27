public class Searches {

    /**
     * Searches items array for goal
     * pre: items is sorted from low to high
     * post: Position of goal has been returned,
     * or -1 has been returned if goal not found.
     */
    public static int binarySearch(int[] items, int start, int end, int goal) {
        int mid = (start + end) / 2;
        System.out.println("Checking for " + goal + " at " + mid);
        if (start > end) {
            return (-1);
        } else {
            if (goal == items[mid]) {
                return (mid);
            } else if (goal < items[mid]) {
                return (binarySearch(items, start, mid - 1, goal));
            } else {
                return (binarySearch(items, mid + 1, end, goal));
            }
        }
    }

    public static int binarySearch(String[] items, int start, int end, String goal) {
        int mid = (start + end) / 2;
        System.out.println("Checking for " + goal + " at " + mid);
        if (start > end) {
            return (-1);
        } else {
            if (goal.compareTo(items[mid]) == 0) {
                return (mid);
            } else if (goal.compareTo(items[mid]) < 0) {
                return (binarySearch(items, start, mid - 1, goal));
            } else {
                return (binarySearch(items, mid + 1, end, goal));
            }
        }
    }

    public static int BinarySearch2(int[] items, int start, int end, int goal) {
        //searches with the method in a do-while loop and replaces recursive calls with appropriate start and end values
        int mid, counter = 0;
        do {
            counter++;
            mid = (start + end) / 2;
            if (goal == items[mid]) {
                break;
            } else if (goal < items[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } while (start <= end);
        System.out.println(counter);
        return mid;
    }

    public static int TernarySearch (int[] items, int start, int end, int goal) {
        int counter = 0;
        if (start > end) {
            return (-1);
        } else {
            counter++;
            int oneThird = (start + end) / 3;
            int twoThirds = (start + end) * 2 / 3;
            if (goal == items[oneThird]) {
                System.out.println(counter);
                return (oneThird);
            } else if (goal == items[twoThirds]) {
                System.out.println(counter);
                return (twoThirds);
            } else if (goal < items[oneThird]) {
                return (TernarySearch(items, start, oneThird - 1, goal));
            } else if (goal < items[twoThirds]) {
                return (TernarySearch(items, oneThird + 1, twoThirds - 1, goal));
            } else {
                return (TernarySearch(items, twoThirds + 1, end, goal));
            }
        }
    }

    public static int interpolationSearch(int[] items, int start, int end, int goal) {
        int mid;

        mid = (int)((double)(goal - items[start]) / (items[end] - items[start])) * (end - start) + start;

        if (start > end) {
            return (-1);
        } else {
            if (goal == items[mid]) {
                return (mid);
            } else if (goal < items[mid]) {
                return (interpolationSearch(items, start, mid - 1, goal));
            } else {
                return (interpolationSearch(items, mid + 1, end, goal));
            }
        }
    }
}
