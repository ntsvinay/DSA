package udemy.sortingAlgo;

public class MergeSort {

	public void merge(int[] arr, int left, int mid, int right) {

		int[] leftTempArr = new int[mid - left + 2];
		int[] rightTempArr = new int[right - mid + 1];

		for (int i = 0; i <= mid - left; i++) {
			leftTempArr[i] = arr[left + 1];
		}
		for (int i = 0; i < right - mid; i++) {
			rightTempArr[i] = arr[mid + i + 1];
		}

		leftTempArr[mid - left + 1] = Integer.MAX_VALUE;
		rightTempArr[right - mid] = Integer.MAX_VALUE;

		int i = 0, j = 0;
		for (int k = left; k <= right; k++) {

			if (leftTempArr[i] < rightTempArr[j]) {
				arr[k] = leftTempArr[i];
				i++;
			} else {
				arr[k] = rightTempArr[j];
				j++;
			}
		}
	}

	public void mergeSort(int[] ar, int left, int right) {
		if (right > left) {
			int m = (right + left) / 2;
			mergeSort(ar, left, m);
			mergeSort(ar, m + 1, right);
			merge(ar, left, m, right);
		}

	}

}
