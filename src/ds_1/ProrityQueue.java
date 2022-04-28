package ds_1;

import java.util.ArrayList;

public class ProrityQueue {

	ArrayList<Integer> arrList;

	public ProrityQueue() {
		// TODO Auto-generated constructor stub
		arrList = new ArrayList<>();
	}

	void insert(int val) {
		int size = arrList.size();

		if (arrList.size() == 0) {
			arrList.add(val);
			System.out.println("inserted-" + val);
		} else {
			arrList.add(val);
			System.out.println("inserted-" + val);
			for (int i = size / 2 - 1; i >= 0; i--) {
				hepify(i);
			}
		}

	}

	void delete(int num) {
		int i;
		int size = arrList.size();
		int temp = arrList.get(num);// if num holding index number for dlt
		arrList.set(num, arrList.get(size - 1));
		arrList.set(size - 1, temp);
		// if num is value thn use first we have to find index of that value
		for (i = 0; i <= arrList.size() - 1; i++) {
			if (arrList.get(i) == num)
				break;
		}
		int val = arrList.get(i);
		arrList.set(i, arrList.get(size - 1));
		arrList.set(size - 1, val);

		System.out.println("deleted-" + arrList.get(size - 1));
		arrList.remove(size - 1);
		for (int j = size / 2 - 1; j >= 0; j--) {
			hepify(j);

		}

	}

	void hepify(int ind) {
		int size = arrList.size();

		int lar = ind;
		int lC = 2 * lar + 1;
		int rC = 2 * lar + 2;
		if (lC < size && arrList.get(lar) < arrList.get(lC)) {
			lar = lC;

		}
		if (rC < size && arrList.get(lar) < arrList.get(rC)) {
			lar = rC;
		}
		if (lar != ind) {
			int temp = arrList.get(lar);
			arrList.set(lar, arrList.get(ind));
			arrList.set(ind, temp);
			hepify(lar);

		}

	}

	void print() {
		for (int val : arrList) {
			System.out.print(val);
		}
		System.out.println();

	}

	public static void main(String[] args) {

		ProrityQueue prorityQueue = new ProrityQueue();

		prorityQueue.insert(1);
		prorityQueue.insert(2);
		prorityQueue.insert(3);
		prorityQueue.insert(4);
		prorityQueue.insert(3);
		prorityQueue.print();
		prorityQueue.insert(9);
		prorityQueue.insert(7);
		prorityQueue.insert(6);
		prorityQueue.print();
		prorityQueue.delete(3);
		prorityQueue.print();

	}
}
