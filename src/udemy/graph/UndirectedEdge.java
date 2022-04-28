package udemy.graph;

public class UndirectedEdge {
	public WeightedGraphNode first;
	public WeightedGraphNode second;
	public int weight;

	public UndirectedEdge(WeightedGraphNode first, WeightedGraphNode second, int weight) {
		this.weight = weight;
		this.first = first;
		this.second = second;
	}

	public String toString() {
		return "Edge" + "(" + first + " , " + second + "), Weight =" + weight;
	}

}
