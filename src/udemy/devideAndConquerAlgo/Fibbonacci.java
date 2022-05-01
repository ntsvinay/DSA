package udemy.devideAndConquerAlgo;

public class Fibbonacci {

	public int getFibonacci(int num) {
		if (num == 1) {
			return 0;
		} else if (num == 2) {
			return 1;
		} else {
			return getFibonacci(num - 1) + getFibonacci(num - 2);
		}

	}

	public static void main(String[] args) {
		System.out.println(new Fibbonacci().getFibonacci(10));
	}

}
