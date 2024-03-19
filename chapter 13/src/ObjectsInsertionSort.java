public class ObjectsInsertionSort {
    public static void main(String[] args) {
        String items[] = { "A poop", "B poop", "Fart", "Poop", "Zoop", "Goop" };
        Sorts.insertionSort(items);

        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
    }
}
