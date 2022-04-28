package udemy.array.interviewQuestion;

import java.util.HashMap;

public class PairTwoSum {
	public void getSumIndexs(int arr[], int target) {
		int[] indVal = new int[2];

		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < arr.length - 1; i++) {

			if (hashMap.containsKey(target-arr[i])) {
					hashMap.put(arr[i],i);

			} else {
				hashMap.put(target - arr[i], i);
			}

		}
		

	}

	public static void main(String[] args) {
		new PairTwoSum().getSumIndexs(new int[] { 1, 8, 6, 5 }, 9);
	}

}
