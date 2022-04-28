package udemy.recursion;

public class GCD_GreatedCommonDivison {
	public static void main(String[] args) {
		System.out.println(new GCD_GreatedCommonDivison().findGCDOfNumbers(8, 4));
	}

	public int findGCDOfNumbers(int a, int b) {
		if (a < 0 || b < 0)
			return -1;
		if (b == 0)
			return a;

		return findGCDOfNumbers(b, a % b);
	}

}
