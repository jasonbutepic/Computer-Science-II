public class ObjectMergesort {
    public static void main(String[] args) {
        int items[] = { 3, 5, 1, 6, 7, 2, 4 };
        Sorts.mergesort(items, 0, items.length - 1);

        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }   
    }
}
