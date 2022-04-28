package udemy.recursion;

public class PowerOfNumber {
	public static void main(String[] args) {
		System.out.println(new PowerOfNumber().getPowerValue(3,3 ));
	}

	public int getPowerValue(int number, int power) {
		if (power == 0 || number <= 0) {
			return 1;
		}
		return number * getPowerValue(number, power - 1);

	}
}
