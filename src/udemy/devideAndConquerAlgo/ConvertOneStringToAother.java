package udemy.devideAndConquerAlgo;

public class ConvertOneStringToAother {

	private int convertString(String s1, String s2, int l1, int l2) {
		if (l1 >= s1.length()) {
			return s2.length() - l2;
		}
		if (l2 >= s2.length()) {
			return s1.length() - l2;
		}
		if (s1.charAt(l1) == s2.charAt(l2)) {
			return convertString(s1, s2, l1 + 1, l2 + 1);
		}
		int dlt = 1 + convertString(s1, s2, l1 + 1, l2);
		int insrt = 1 + convertString(s1, s2, l1, l2 + 1);
		int rplce = 1 + convertString(s1, s2, l1 + 1, l2 + 1);
		return Math.min(insrt, rplce);
	}

	public int convertString(String s1, String s2) {
		return convertString(s1, s2, 0, 0);
	}

	public static void main(String[] args) {
		System.out.println(new ConvertOneStringToAother().convertString("tgblp", "table"));
	}
}
