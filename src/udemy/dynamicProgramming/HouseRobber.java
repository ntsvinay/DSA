package udemy.dynamicProgramming;

public class HouseRobber {
	public int rob(int[] nums) {

		// return rob(nums,0);//divide and conquer

		// int[] arr=new int[nums.length];
		// return rob(arr,nums,0);//dp b2t
		// below t2b
		int dp[] = new int[nums.length + 2];
		dp[nums.length] = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			dp[i] = Math.max(nums[i] + dp[i + 2], dp[i + 1]);
		}
		return dp[0];
	}

	public int rob(int[] house, int crtHouse) {
		if (crtHouse >= house.length) {
			return 0;
		}
		return Math.max(house[crtHouse] + rob(house, crtHouse + 2), rob(house, crtHouse + 1));
	}

	public int rob(int[] arr, int[] hMoney, int crtInd) {
		if (crtInd >= hMoney.length) {
			return 0;
		}
		if (arr[crtInd] == 0) {
			int stealCrt = hMoney[crtInd] + rob(arr, hMoney, crtInd + 2);
			int skipCrt = rob(arr, hMoney, crtInd + 1);
			arr[crtInd] = Math.max(stealCrt, skipCrt);
		}
		return arr[crtInd];
	}
}
