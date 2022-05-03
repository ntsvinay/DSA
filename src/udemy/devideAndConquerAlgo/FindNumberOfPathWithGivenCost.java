package udemy.devideAndConquerAlgo;

public class FindNumberOfPathWithGivenCost {
	public int findPathWithGivenCost(int[][] arr, int row, int col, int cost) {
		if (cost <= 0) {
			return 0;
		}
		if (row == 0 || col == 0) {
			return (arr[0][0] - cost == 0) ? 1 : 0;
		}
		if (row == 0) {
			return findPathWithGivenCost(arr, 0, col - 1, cost - arr[row][col]);
		}
		if (col == 0) {
			return findPathWithGivenCost(arr, row - 1, 0, cost - arr[row][col]);
		}
		int noOfPathFromPRow = findPathWithGivenCost(arr, row - 1, col, cost - arr[row][col]);
		int noOfPathFromPCol = findPathWithGivenCost(arr, row, col - 1, cost - arr[row][col]);
		return noOfPathFromPRow + noOfPathFromPCol;
	}

	public static void main(String[] args) {
		int arr[][] = { { 4, 7, 8, 6, 4 }, { 6, 7, 3, 9, 2 }, { 3, 8, 1, 2, 4 }, { 7, 1, 7, 3, 7 }, { 2, 9, 8, 9, 3 } };
		System.out.println(
				new FindNumberOfPathWithGivenCost().findPathWithGivenCost(arr, arr.length - 1, arr[0].length - 1, 25));

	}

}
