public class ObjectMergesort {
    public static void main(String[] args) {
        String items[] = { "A poop", "B poop", "Fart", "Poop", "Zoop", "Goop"};
        Sorts.mergesort(items, 0, items.length - 1);

        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }   
    }
}
