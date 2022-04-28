package udemy.StackAndQueue.InterviewQuestions;

public abstract class Animals {
	private int order;
	protected String name;

	public Animals(String name) {
		this.name = name;
	}

	public abstract String name();

	public void setOrder(int order) {
		this.order = order;
	}

	public int getOrder() {
		return order;
	}

	public boolean isOlderThan(Animals a) {
		return this.order < a.getOrder();

	}
}
