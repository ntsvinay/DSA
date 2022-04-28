package sortingSearching;

import java.util.Arrays;

public class BubbleSort {

	public void sortArr(int[] elements) {
		int size = elements.length;

		for (int i = 0; i <= size - 1; i++) {
			for (int j = i + 1; j <= size - 1; j++) {
				if (elements[i] > elements[j]) {
					int val = elements[i];
					elements[i] = elements[j];
					elements[j] = val;

				}

			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 9, 3, 4, 2, 3, 0 };
		new BubbleSort().sortArr(arr);
		System.out.println(Arrays.toString(arr));

	}
}
