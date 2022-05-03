package udemy.devideAndConquerAlgo;

public class ZeroOneKnapSackProblem {
	private int knapSack(int[] profits, int[] weight, int crtIndex, int capacity) {
		if (crtIndex < 0 || capacity <= 0 || crtIndex >= profits.length) {
			return 0;
		}
		int profit = 0;
		int profit1 = 0;
		if (capacity >= weight[crtIndex]) {
			profit = profits[crtIndex] + knapSack(profits, weight, crtIndex + 1, capacity - weight[crtIndex]);
		}
		profit1 = knapSack(profits, weight, crtIndex + 1, capacity);
		return Math.max(profit, profit1);
	}

	public int knapSack(int[] profits, int[] weight, int capacity) {
		return knapSack(profits, weight, 0, capacity);
	}

	public static void main(String[] args) {
		System.out.println(
				new ZeroOneKnapSackProblem().knapSack(new int[] { 31, 26, 17, 72 }, new int[] { 3, 1, 2, 5 }, 7));
	}

}
