public class ObjectsInsertionSort {
    public static void main(String[] args) {
        int items[] = { 3, 5, 1, 6, 7, 2, 4 };
        insertionSort(items);

        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
    }

    public static void insertionSort(int[] items) {

        int temp, previousIndex;
        
        for (int index = 1; index < items.length; index++) {
                temp = items[index];
                previousIndex = index - 1;
            
                while ((items[previousIndex] > temp) && (previousIndex > 0)) {
                    items[previousIndex + 1] = items[previousIndex];
                    previousIndex -= 1;
                }
        
                if (items[previousIndex] > temp) {
                    items[previousIndex + 1] = items[previousIndex];
                    items[previousIndex] = temp;
                } else {
                    items[previousIndex + 1] = temp;
                }
        }
        }
}
