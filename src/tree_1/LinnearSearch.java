package tree_1;

public class LinnearSearch {
	public int linSearch(int arr[], int element) {
		int result = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == element) {
				result = i;
				break;
			}

		}
		return result;

	}

	public static void main(String[] args) {
		int[] intArr = { 1, 22, 23, 24, 46, 47 };
		System.out.println(new LinnearSearch().linSearch(intArr, 23));

	}

}
