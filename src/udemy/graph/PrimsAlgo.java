package udemy.graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgo {
	ArrayList<WeightedGraphNode> nodeList = new ArrayList<>();

	public PrimsAlgo(ArrayList<WeightedGraphNode> nodeList) {
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

	}

	public void primsAlgo(WeightedGraphNode node) {
		for (int i = 0; i < nodeList.size(); i++) {
			nodeList.get(i).distance = Integer.MAX_VALUE;
		}
		node.distance = 0;
		PriorityQueue<WeightedGraphNode> pQue = new PriorityQueue<>();
		pQue.addAll(nodeList);
		while (!pQue.isEmpty()) {
			WeightedGraphNode crtNode = pQue.remove();
			for (WeightedGraphNode nie : crtNode.neibourList) {
				if (pQue.contains(nie)) {
					if (nie.distance > crtNode.weightMap.get(nie)) {
						nie.distance = crtNode.weightMap.get(nie);
						nie.parent = crtNode;
						pQue.remove(nie);
						pQue.add(nie);
					}
				}
			}
		}
		int cost = 0;
		for (WeightedGraphNode crtNode : nodeList) {
			System.out.println("Node --" + crtNode + " dis -" + crtNode.distance + " Parent " + crtNode.parent);
			cost =cost+ crtNode.distance;
		}
		System.out.println("Total cost " + cost);
	}

}
