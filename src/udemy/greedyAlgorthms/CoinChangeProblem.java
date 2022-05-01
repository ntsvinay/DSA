package udemy.greedyAlgorthms;

import java.util.Arrays;

public class CoinChangeProblem {

	public void coinChange(int[] coins, int c) {
		Arrays.sort(coins);
		int index = coins.length - 1;
		while (index>=0) {
			int coinVal = coins[index];
			index--;
			int maxAmount = (c / coinVal) * coinVal;
			if (maxAmount > 0) {
				System.out.println("Coin val " + coinVal + " taken Coin count " + (c / coinVal));
				c = c - maxAmount;
			}
			if (c == 0) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		new CoinChangeProblem().coinChange(new int[] {186,419,83,408 }, 6249);
	}

}
