package udemy.greedyAlgorthms;

public class Activity {
	private String namme;
	private int startTime;
	private int finishTime;

	public Activity(String namme, int startTime, int finishTime) {
		this.namme = namme;
		this.startTime = startTime;
		this.finishTime = finishTime;
	}

	public String getNamme() {
		return namme;
	}

	public void setNamme(String namme) {
		this.namme = namme;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getFinishTime() {
		return finishTime;
	}

	@Override
	public String toString() {
		return "Activity [namme=" + namme + ", startTime=" + startTime + ", finishTime=" + finishTime + "]";
	}

	public void setFinishTime(int finishTime) {
		this.finishTime = finishTime;
	}

}
