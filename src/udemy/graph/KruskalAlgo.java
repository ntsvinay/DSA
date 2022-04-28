package udemy.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class KruskalAlgo {
	ArrayList<WeightedGraphNode> nodeList = new ArrayList<>();
	ArrayList<UndirectedEdge> edgeList = new ArrayList<>();

	public KruskalAlgo(ArrayList<WeightedGraphNode> nodeList) {
		this.nodeList = nodeList;
	}

	public void addWeightedUndirectedEde(int firstIndex, int secondIndex, int weight) {
		UndirectedEdge edge = new UndirectedEdge(nodeList.get(firstIndex), nodeList.get(secondIndex), weight);

		WeightedGraphNode first = edge.first;
		WeightedGraphNode second = edge.second;

		first.neibourList.add(second);
		second.neibourList.add(first);

		first.weightMap.put(second, weight);
		second.weightMap.put(first, weight);

		edgeList.add(edge);
	}

	public void kruskal() {
		DisjointSetMSTree.makeSet(nodeList);
		Comparator<UndirectedEdge> comparator = new Comparator<UndirectedEdge>() {

			@Override
			public int compare(UndirectedEdge o1, UndirectedEdge o2) {
				// TODO Auto-generated method stub
				return o1.weight - o2.weight;
			}
		};

		Collections.sort(edgeList, comparator);

		int cost = 0;
		for (UndirectedEdge edge : edgeList) {

			WeightedGraphNode first = edge.first;
			WeightedGraphNode second = edge.second;

			if (!DisjointSetMSTree.findSet(first).equals(DisjointSetMSTree.findSet(second))) {
				DisjointSetMSTree.unionNode(first, second);
				cost += edge.weight;
				System.out.println("Taken : " + edge);
			}
		}
		System.out.println("Total Cost : " + cost);
	}
}
