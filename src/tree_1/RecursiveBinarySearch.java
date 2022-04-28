package tree_1;

public class RecursiveBinarySearch {

	public int binSearch(int element, int[] intArr, int low, int high) {
		int mid, mySol = 0;

		if (low > high) {
			mySol = -1;
		} else {
			mid = (low + high) / 2;

			if (element == intArr[mid]) {
				mySol = mid;
			} else if (element < intArr[mid]) {
				mySol=binSearch(element, intArr, low, mid - 1);
			} else {
				mySol=binSearch(element, intArr, mid + 1, high);
			}
		}

		return mySol;

	}

	public static void main(String[] args) {
		int[] intArr = { 1, 22, 23, 24, 46, 47 };
		System.out.println(new RecursiveBinarySearch().binSearch(23, intArr, 0, intArr.length));

	}

}
