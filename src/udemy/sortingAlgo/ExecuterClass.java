package udemy.sortingAlgo;

public class ExecuterClass {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 3, 7, 9, 2 };
		SortAlgos bSort = new SortAlgos();
		// bSort.bubbleSort(arr);
		// bSort.selectionSort(arr);
		// bSort.inserationSort(arr);
		// MergeSort ms = new MergeSort();
		// ms.mergeSort(arr, 0, arr.length - 1);
		//QuickSort qS = new QuickSort();
		//qS.quickSort(arr, 0, arr.length - 1);
		HeapSort sh=new HeapSort();
		sh.sort(arr);
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

}
