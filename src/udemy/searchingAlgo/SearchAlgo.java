package udemy.searchingAlgo;

public class SearchAlgo {
	public int linearSeach(int[] arr, int val) {
		int ind = -1;
		for (int i = 0; i < arr.length; i++) {
			if (val == arr[i]) {
				System.out.println("found");
				return i;
			}
		}
		System.out.println("not found");
		return ind;

	}

	public int binarySearch(int[] arr, int val) {
		int start = 0, end = arr.length-1, mid = (start + end) / 2;
		while (arr[mid] != val && start < end) {
			if (val <= arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			mid = (start + end) / 2;
		}
		if (arr[mid] == val) {
			System.out.println("found");
			return mid;
		}

		System.err.println("not found");
		return mid;
	}
}
