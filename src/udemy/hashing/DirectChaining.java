package udemy.hashing;

import java.util.LinkedList;

public class DirectChaining {
	LinkedList<String>[] hashTable;
	int maxSize = 5;

	public DirectChaining(int size) {
		// TODO Auto-generated constructor stub
		hashTable = new LinkedList[size];
	}

	public int getIndexNum(String word, int m) {
		int totalWord = 0;
		if (word == null) {
			return -1;
		} else {
			char[] chArr = word.toCharArray();
			for (int i = 0; i < chArr.length; i++) {
				totalWord += chArr[i];
			}

		}
		return totalWord % m;

	}

	public void insert(String word) {
		int index = getIndexNum(word, hashTable.length);
		if (hashTable[index] == null) {
			hashTable[index] = new LinkedList<>();
			hashTable[index].add(word);
		} else {
			hashTable[index].add(word);
		}

	}

	public void display() {
		if (hashTable != null) {
			for (int i = 0; i < hashTable.length; i++) {
				System.out.println(i + "-" + hashTable[i]);
			}
		}

	}

	public boolean search(String word) {
		int index = getIndexNum(word, hashTable.length);
		if (hashTable[index] != null && hashTable[index].contains(word)) {
			System.out.println(word + " : is exist at " + index);
			return true;
		} else {
			System.out.println(word + " : is not found ");
			return false;
		}
	}

	public void delete(String word) {
		int index = getIndexNum(word, hashTable.length);
		boolean exist = search(word);
		if (exist) {
			hashTable[index].remove(word);
		}
	}

}
