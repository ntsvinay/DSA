package udemy.sortingAlgo;

import udemy.Tree_BinaryTree.BHeap;

public class HeapSort {

	public void sort(int[] arr) {
		BHeap bHeap = new BHeap(arr.length);
		for (int i = 0; i < arr.length; i++) {
			bHeap.insert(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = bHeap.extractHeap("Min");
		}

	}
}
