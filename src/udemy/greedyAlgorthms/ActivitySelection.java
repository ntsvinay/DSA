package udemy.greedyAlgorthms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {

	public static void activitySelections(ArrayList<Activity> activityList) {
		Comparator<Activity> comp = new Comparator<Activity>() {

			@Override
			public int compare(Activity o1, Activity o2) {
				// TODO Auto-generated method stub
				return o1.getFinishTime() - o2.getFinishTime();
			}
		};
		Collections.sort(activityList, comp);

		Activity previousActivity = activityList.get(0);
		System.out.println(activityList.get(0));
		for (int i = 1; i < activityList.size(); i++) {
			Activity crtActivity = activityList.get(i);

			if (crtActivity.getStartTime() >= previousActivity.getFinishTime()) {
				System.out.println(crtActivity);
				previousActivity = crtActivity;
			}
		}

	}

}
