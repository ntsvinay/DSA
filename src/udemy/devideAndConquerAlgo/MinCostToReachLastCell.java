package udemy.devideAndConquerAlgo;

public class MinCostToReachLastCell {
	private int minCost(int[][] cost, int row, int col) {
		if (row == -1 || col == -1) {
			return 0;
		}
		if (row == 0 || col == 0) {
			return cost[row][col];
		}
		int minCost1 = minCost(cost, row, col - 1);
		int minCost2 = minCost(cost, row - 1, col);
		return Math.min(minCost1, minCost2) + cost[row][col];
	}

	public static void main(String[] args) {
		int arr[][] = { { 4, 7, 8, 6, 4 }, { 6, 7, 3, 9, 2 }, { 3, 8, 1, 2, 4 }, { 7, 1, 7, 3, 7 }, { 2, 9, 8, 9, 3 } };
		System.out.println(new MinCostToReachLastCell().minCost(arr, arr.length - 1, arr[0].length - 1));
	}

}
