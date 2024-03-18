import java.util.ArrayList;

public class ArrayListSort {
	public static void main(String[] args) {
		ArrayList<Integer> items = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			items.add((int) (Math.random() * 100));
		}

		Sorts.selectionSort(items);

		for (int i = 0; i < items.size(); i++) {
			System.out.print(items.get(i) + " ");
		}
	}
}
