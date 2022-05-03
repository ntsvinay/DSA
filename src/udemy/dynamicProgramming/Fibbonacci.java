package udemy.dynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;

public class Fibbonacci {

	public int fib(int n, HashMap<Integer, Integer> memo) {
		if (n == 1) {
			return 0;
		}
		if (n == 2) {
			return 1;
		}
		if (!memo.containsKey(n)) {
			memo.put(n, fib(n - 1, memo) + fib(n - 2, memo));
		}
		return memo.get(n);
	}

	public int fib(int n) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(1);
		for (int i = 2; i <= n - 1; i++) {
			int n1 = al.get(i - 1);
			int n2 = al.get(i - 2);
			al.add(n1 + n2);
			System.out.print(n1+n2+",");
		}
		return al.get(n-1);
	}

	public static void main(String[] args) {
		System.out.println(new Fibbonacci().fib(10, new HashMap<>()));
		System.out.println(new Fibbonacci().fib(10));
	}

}
