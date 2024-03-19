import java.util.ArrayList;

public class Sorts {

		/**
		 * Sorts an array of data from low to high
		 * pre: none
		 * post: items has been sorted from low to high
		 */
		public static void selectionSort(int[] items) {
			
			for (int index = 0; index < items.length; index++) {
				for (int subIndex = index; subIndex < items.length; subIndex++) {
					if (items[subIndex] < items[index]) {
						int temp = items[index];
						items[index] = items[subIndex];
						items[subIndex] = temp;
					}
				}	
			}
		}
	

	/**
	 * Sorts an array of objects from low to high
	 * pre: none
	 * post: objects have been sorted from low to high
	 */
	public static void selectionSort(Comparable[] items) {

		for (int index = 0; index < items.length; index++) {
			for (int subIndex = index; subIndex < items.length; subIndex++) {
				if (items[subIndex].compareTo(items[index]) < 0) {
					Comparable temp = items[index];
					items[index] = items[subIndex];
					items[subIndex] = temp;
				}
			}
		}
	}

	public static void selectionSort(ArrayList<Integer> items) {
		for (int index = 0; index < items.size(); index++) {
			for (int subIndex = index; subIndex < items.size(); subIndex++) {
				if (items.get(subIndex).compareTo(items.get(index)) < 0) {
					Integer temp = items.get(index);
					items.set(index, items.get(subIndex));
					items.set(subIndex, temp);
				}
			}
		}
	}

	/**
* Sorts an array of integer from low to high
* pre: none
* post: Integers have been sorted from low to high
*/
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

	public static void insertionSort(String[] items) {
		String temp;
		int previousIndex;
		for (int index = 1; index < items.length; index++) {
			temp = items[index];
			previousIndex = index - 1;
			while ((items[previousIndex].compareTo(temp) > 0) && (previousIndex > 0)) {
				items[previousIndex + 1] = items[previousIndex];
				previousIndex -= 1;
			}
			if (items[previousIndex].compareTo(temp) > 0) {
				items[previousIndex + 1] = items[previousIndex];
				items[previousIndex] = temp;
			} else {
				items[previousIndex + 1] = temp;
			}
		}
	}
	

	private static void merge(int[] items, int start, int mid, int end) {
		int[] temp = new int[items.length];
		int pos1 = start;
		int pos2 = mid + 1;
		int spot = start;

		while (!(pos1 > mid && pos2 > end)) {
			if ((pos1 > mid) || ((pos2 <= end) && (items[pos2] < items[pos1]))) {
				temp[spot] = items[pos2];
				pos2 += 1;
			} else {
				temp[spot] = items[pos1];
				pos1 += 1;
			}
			spot += 1;
		}
		/* copy values from temp back to items */
		for (int i = start; i <= end; i++) {
			items[i] = temp[i];
		}
	}

	// Sorts an array of integers using Merge Sort
	public static void mergesort(int[] items, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergesort(items, start, mid);
			mergesort(items, mid + 1, end);
			merge(items, start, mid, end);
		}
	}

	public static void merge(Comparable[] items, int start, int mid, int end) {
		Comparable[] temp = new Comparable[items.length];
		int pos1 = start;
		int pos2 = mid + 1;
		int spot = start;

		while (!(pos1 > mid && pos2 > end)) {
			if ((pos1 > mid) || ((pos2 <= end) && (items[pos2].compareTo(items[pos1]) < 0))) {
				temp[spot] = items[pos2];
				pos2 += 1;
			} else {
				temp[spot] = items[pos1];
				pos1 += 1;
			}
			spot += 1;
		}
		/* copy values from temp back to items */
		for (int i = start; i <= end; i++) {
			items[i] = temp[i];
		}
	}

	public static void mergesort(Comparable[] items, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergesort(items, start, mid);
			mergesort(items, mid + 1, end);
			merge(items, start, mid, end);
		}
	}

}
