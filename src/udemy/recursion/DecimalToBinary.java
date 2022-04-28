package udemy.recursion;

public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println(new DecimalToBinary().getBinaryNumber(10));

	}

	public int getBinaryNumber(int number) {
		if (number == 0)
			return 0;
		return number % 2 + 10 * getBinaryNumber(number / 2);
	}

}
