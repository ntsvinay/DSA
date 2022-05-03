
package udemy.dynamicProgramming;

public class NumberFactor {

	public int numberFact(int num, int[] al) {
		if (num == 0 || num == 1 || num == 2) {
			return 1;
		}
		if (num == 3) {
			return 2;
		}
		if (al[num] == 0) {
			int sp = numberFact(num - 1, al);
			int sp1 = numberFact(num - 3, al);
			int sp2 = numberFact(num - 4, al);
			al[num] = sp + sp1 + sp2;
		}
		return al[num];
	}

	public int b2uApproch(int n) {
		int[] arr = new int[n + 1];
		arr[0] = arr[1] = arr[2] = 1;
		arr[3] = 2;
		for (int i = 4; i <=n; i++) {
			arr[i] = arr[i - 1] + arr[i - 3] + arr[i - 4];
		}

		return arr[n];

	}

	public static void main(String[] args) {
		System.out.println(new NumberFactor().numberFact(6, new int[6 + 1]));
		System.out.println(new NumberFactor().b2uApproch(6));
	}

}
