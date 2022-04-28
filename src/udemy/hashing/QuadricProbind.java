package udemy.hashing;

import java.util.ArrayList;

public class QuadricProbind {
	String[] hashTable;
	int usedCells;

	public QuadricProbind(int size) {
		// TODO Auto-generated constructor stub
		hashTable = new String[size];
		usedCells = 0;
	}

	public int getIndex(String word, int m) {
		int wrdLen = 0;
		if (word == null) {
			return -1;
		} else {
			char[] chArr = word.toCharArray();
			for (int i = 0; i < chArr.length; i++) {
				wrdLen += chArr[i];
			}
		}
		return wrdLen % m;

	}

	public double getLoadfactor() {
		double loadFact = usedCells * 1.0 / hashTable.length;
		return loadFact;
	}

	public void reHashing(String word) {
		usedCells = 0;
		ArrayList<String> tempData = new ArrayList<>();
		for (String wrd : hashTable) {
			tempData.add(wrd);
		}
		tempData.add(word);
		hashTable = new String[2 * hashTable.length];

		for (String wrd : tempData) {
			insert(wrd);
		}

	}

	public void insert(String word) {
		if (getLoadfactor() >= 0.75) {
			reHashing(word);
		} else {
			int index = getIndex(word, hashTable.length);
			int counter = 0;
			for (int i = index; i < index + hashTable.length; i++) {
				index = i + (counter * counter) % hashTable.length;
				if (hashTable[index] == null) {
					hashTable[index] = word;
					break;
				}
				counter++;
			}

		}
		usedCells++;
	}

	public void display() {
		if (hashTable != null) {
			for (int i = 0; i < hashTable.length; i++) {
				System.out.println(i + "-" + hashTable[i]);
			}
		}

	}

	public boolean search(String word) {
		int index = getIndex(word, hashTable.length);
		for (int i = 0; i < index + hashTable.length; i++) {
			int newIndex = index % hashTable.length;
			if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
				System.out.println(word + " is exist");
				return true;
			}
		}
		System.out.println(word + " is not exist");
		return false;
	}

	public void delete(String word) {
		int index = getIndex(word, hashTable.length);
		boolean flg = search(word);
		for (int i = 0; i < index + hashTable.length; i++) {
			int newIndex = index % hashTable.length;
			if (hashTable[newIndex].contains(word) && hashTable != null) {
				hashTable[newIndex] = null;
			}
		}

	}
}
