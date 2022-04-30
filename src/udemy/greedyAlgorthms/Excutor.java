package udemy.greedyAlgorthms;

import java.util.ArrayList;

public class Excutor {
	public static void main(String[] args) {
		ArrayList<Activity> activityList = new ArrayList<>();
		activityList.add(new Activity("A1", 0, 6));
		activityList.add(new Activity("A2", 3, 4));
		activityList.add(new Activity("A3", 1, 2));
		activityList.add(new Activity("A4", 5, 8));
		activityList.add(new Activity("A5", 5, 7));
		activityList.add(new Activity("A6", 8, 9));
		ActivitySelection act = new ActivitySelection();
		//act.activitySelections(activityList);

		ArrayList<KnapsackItem> knapsackList = new ArrayList<>();
		int[] value = { 100, 120, 60 };
		int[] weight = { 20, 30, 10 };
		int capacity = 50;
		for (int i = 0; i < value.length; i++) {
			knapsackList.add(new KnapsackItem(i + 1, value[i], weight[i]));
		}
		FractionalKnapsack.KnapSack(knapsackList, capacity);
	}
}
