package udemy.devideAndConquerAlgo;

public class NumberFactor {

	public int findNumberFact(int num) {
		int rslt = 0;
		if (num == 0 || num == 1 || num == 2) {
			return 1;
		}
		if (num == 3) {
			return 2;
		}
		int sub = findNumberFact(num - 1);
		int sub1 = findNumberFact(num - 3);
		int sub2 = findNumberFact(num - 4);
		return sub + sub1 + sub2;

	}

	public static void main(String[] args) {
		NumberFactor nf = new NumberFactor();
		System.out.println(nf.findNumberFact(6));
	}

}
