package greedy_algo_methods;

import static java.lang.Integer.max;

class Kanpsack {
	static int knapSack(int W, int wt[], int val[], int n) {
		int i, w;
		int K[][] = new int[n + 1][W + 1];

		for (i = 0; i <= n; i++) {
			for (w = 0; w <= W; w++) {
				if (i == 0 || w == 0)
					K[i][w] = 0;
				else if (wt[i - 1] <= w)
					K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
				else
					K[i][w] = K[i - 1][w];
			}
		}

		return K[n][W];
	}
	

	public static void main(String args[]) {
		int val[] = new int[] { 5, 10, 15, 7, 8, 9, 4 };// profit
		int wt[] = new int[] { 1, 3, 5, 4, 1, 3, 2 };// weight

		int W = 16;// bag capacity
		int n = val.length;// size of items
		System.out.println(knapSack(W, wt, val, n));
	}
}
