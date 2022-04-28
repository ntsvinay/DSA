package udemy.sortingAlgo;

public class QuickSort {
	public int partition(int arr[], int start, int end) {
		int pivat = end;
		int j = start - 1;
		for (int i = start; i <= end; i++) {
			if (arr[i] <= arr[pivat]) {
				j++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		return j;
	}

	public void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int pivot = partition(arr, start, end);
			quickSort(arr, start, pivot-1);
			quickSort(arr, pivot + 1, end);
		}

	}
}
