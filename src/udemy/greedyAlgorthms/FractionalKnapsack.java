package udemy.greedyAlgorthms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FractionalKnapsack {
	static void KnapSack(ArrayList<KnapsackItem> knapsackItem, int capacity) {
		Comparator<KnapsackItem> comp = new Comparator<KnapsackItem>() {
			@Override
			public int compare(KnapsackItem o1, KnapsackItem o2) {
				// TODO Auto-generated method stub
				if (o2.getRatio() > o1.getRatio()) {
					return 1;
				} else {
					return -1;
				}
			}
		};
		Collections.sort(knapsackItem, comp);
		int usedCapacity = 0;
		double totalVal = 0;
		for (KnapsackItem crt : knapsackItem) {
			if (usedCapacity + crt.getWeight() <= capacity) {
				usedCapacity += crt.getWeight();
				System.out.println("Taken " + crt);
				totalVal += crt.getValue();
			} else {
				int usedWeight = capacity - usedCapacity;
				double value = crt.getRatio() * usedWeight;
				System.out.println(
						"Taken Items index = " + crt.getIndex() + "value " + value + "used weight " + usedWeight);
				usedCapacity += usedWeight;
				totalVal += value;
			}
			if (usedCapacity == capacity) {
				break;
			}

		}
		System.out.println("total value: " + totalVal);

	}

}
