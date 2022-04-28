package greedy_algo_methods;
public class FractionalKanpsack {
    private static int getMaxIndex(int[] weight, int[] values) {
        int max_i = 0;
        double max = 0;
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] != 0 && (double) values[i] / weight[i] > max) {
                max = (double) values[i] / weight[i];
                max_i = i;
            }
        }
        return max_i;
    }
    private static double getOptimalValue(int capacity_is, int[] values, int[] weight) {
        double value = 0.0;
        for (int i = 0; i < weight.length; i++) {
            if (capacity_is == 0)
                return value;
            int index = getMaxIndex(weight, values);
            int a = Math.min(capacity_is, weight[index]);
            value += a * (double) values[index] / weight[index];
            weight[index] -= a;
            capacity_is -= a;
        }
        return value;
    }
    public static void main(String[] args) {
    	int val[] = new int[] { 5, 10, 15, 7, 8, 9, 4 };// profit
		int wt[] = new int[] { 1, 3, 5, 4, 1, 3, 2 };// weight

		int W = 16;// bag capacity
		int n = val.length;// size of items
		System.out.println(getOptimalValue(W, val, wt));
	}
}
