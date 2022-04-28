package udemy.array.interviewQuestion;

import java.util.Arrays;

import sun.security.util.Length;

public class MaxProductOfPair {

	public int[] findMaxProOfPair(int arr[]) {
		int maxPro = 0, num1 = 0, num2 = 0;

		for (int i = 0; i < arr.length; i++) {
			int pro = 0;
			for (int j = i + 1; j < arr.length; j++) {

				pro = arr[i] * arr[j];
				if (pro > maxPro) {
					maxPro = pro;
					num1 = i;
					num2 = j;

				}

			}

		}
		return new int[] { num1, num2 };
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(new MaxProductOfPair().findMaxProOfPair(new int[] { 80, 20, 30, 40, 50 })));

	}

}
