package udemy.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedGraphNode implements Comparable<WeightedGraphNode> {
	public String name;
	public int index;
	public boolean isVisited = false;

	// for disjoint set
	public DisjointSetMSTree set;

	public ArrayList<WeightedGraphNode> neibourList = new ArrayList<WeightedGraphNode>();
	public WeightedGraphNode parent;

	public int distance;
	HashMap<WeightedGraphNode, Integer> weightMap = new HashMap<WeightedGraphNode, Integer>();

	public WeightedGraphNode(String name, int index) {
		this.name = name;
		this.index = index;
		this.distance = Integer.MAX_VALUE;
	}

	// for disjoint set only
	public WeightedGraphNode(String name) {
		this.name = name;
		this.distance = Integer.MAX_VALUE;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(WeightedGraphNode o) {
		// TODO Auto-generated method stub
		return this.distance - o.distance;
	}

}
