package udemy.array.interviewQuestion;

public class FindMissingNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			sum += arr[i];

		}
		int missingNumber = 10 * (10 + 1) / 2 - sum;
		System.out.println(missingNumber);
	}

}
