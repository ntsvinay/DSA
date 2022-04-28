package sortingSearching;

import java.util.Arrays;

public class InsertionSort {

	public void sort(int[] element) {
		int size = element.length;
		for (int i = 1; i <= size - 1; i++) {
			int key = element[i];
			int j = i - 1;
			while (j >= 0 && key < element[j]) {
				element[j + 1] = element[j];
				j--;

			}
			element[j + 1] = key;
		}

	}

	public static void main(String[] args) {
		int[] data = { 9, 5, 1, 4, 3 };
		InsertionSort is = new InsertionSort();
		is.sort(data);
		System.out.println("Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(data));

	}

}
