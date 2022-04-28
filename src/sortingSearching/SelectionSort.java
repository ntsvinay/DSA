package sortingSearching;

import java.util.Arrays;

public class SelectionSort {

	public void sort(int[] element) {

		int size = element.length;
		int min = element[0];

		for (int i = 0; i <= size - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j <= size - 1; j++) {
				if (element[minIndex] > element[j]) {
					minIndex = j;
				}
			}
			min = element[i];
			element[i] = element[minIndex];
			element[minIndex] = min;

		}

	}

	public static void main(String[] args) {
		int[] arr = { -1, 2, 1, 0, -9, 8, 9 };
		new SelectionSort().sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
