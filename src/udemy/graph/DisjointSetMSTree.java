package udemy.graph;

import java.util.ArrayList;

public class DisjointSetMSTree {
	ArrayList<WeightedGraphNode> nodeList = new ArrayList<>();

	public static void makeSet(ArrayList<WeightedGraphNode> nodeList) {
		for (WeightedGraphNode node : nodeList) {
			DisjointSetMSTree set = new DisjointSetMSTree();
			set.nodeList.add(node);
			node.set = set;
		}
	}

	public static DisjointSetMSTree findSet(WeightedGraphNode node) {
		return node.set;
	}

	public static DisjointSetMSTree unionNode(WeightedGraphNode first, WeightedGraphNode second) {
		if (first.set == second.set) {
			return null;
		} else {
			if (first.set.nodeList.size() > second.set.nodeList.size()) {
				for (WeightedGraphNode node : second.set.nodeList) {
					node.set = first.set;
					first.set.nodeList.add(node);
				}
				return first.set;
			} else {
				for (WeightedGraphNode node : first.set.nodeList) {
					node.set = second.set;
					second.set.nodeList.add(node);
				}
				return second.set;
			}
		}
	}

	public void printSet() {
		for (WeightedGraphNode node : nodeList) {
			System.out.print(node);
		}
		System.out.println();
	}
}
