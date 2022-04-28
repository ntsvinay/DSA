package udemy.searchingAlgo;

public class ExecutorClass {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 3, 7, 9, 2 };
		SearchAlgo ln = new SearchAlgo();
		ln.linearSeach(arr, 15);
		ln.binarySearch(arr, 15);
	}

}
