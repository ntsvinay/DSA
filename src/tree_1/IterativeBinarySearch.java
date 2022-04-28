package tree_1;

public class IterativeBinarySearch {

	public int iterativeSearch(int element, int[] intArr) {
		int low = 0, high = intArr.length-1, mid = 0, result = 0;

		mid = (low + high) / 2;
		if (low > high) {
			result = -1;
		} else {
			while (low <=high) {
				if (element == intArr[mid]) {
					result = mid;
					break;
				} else if (element < intArr[mid]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
				mid = (low + high) / 2;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		int[] intArr = { 1, 22, 23, 24, 46, 47 };
		System.out.println(new IterativeBinarySearch().iterativeSearch(23, intArr));

	}

}
