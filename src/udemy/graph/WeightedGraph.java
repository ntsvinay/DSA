package udemy.graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeightedGraph {
	ArrayList<WeightedGraphNode> nodeList = new ArrayList<>();

	public WeightedGraph(ArrayList<WeightedGraphNode> nodeList) {
		this.nodeList = nodeList;
	}

	void dijkastra(WeightedGraphNode node) {
		PriorityQueue<WeightedGraphNode> que = new PriorityQueue<>();
		node.distance = 0;
		que.addAll(nodeList);
		while (!que.isEmpty()) {
			WeightedGraphNode crt = que.remove();
			for (WeightedGraphNode nei : crt.neibourList) {
				if (que.contains(nei)) {
					if (nei.distance > crt.distance + crt.weightMap.get(nei)) {
						nei.distance = crt.distance + crt.weightMap.get(nei);
						nei.parent = crt;
						que.remove(nei);
						que.add(nei);
					}
				}
			}
		}
		for (WeightedGraphNode node1 : nodeList) {
			System.out.print(node1 + "--" + node1.distance);
			pathParent(node1);
			System.out.println();
		}
	}

	public void pathParent(WeightedGraphNode node) {
		if (node.parent != null) {
			pathParent(node.parent);
		}
		System.out.print(node.name + " ");
	}

	public void addWeightOfEdge(int i, int j, int d) {
		WeightedGraphNode first = nodeList.get(i);
		WeightedGraphNode second = nodeList.get(j);
		first.neibourList.add(second);
		first.weightMap.put(second, d);

	}

	public void bellmonFordAlgo(WeightedGraphNode source) {
		source.distance = 0;
		for (int i = 0; i < nodeList.size(); i++) {
			for (WeightedGraphNode crtNode : nodeList) {
				for (WeightedGraphNode nei : crtNode.neibourList) {
					if (nei.distance > crtNode.distance + crtNode.weightMap.get(nei)) {
						nei.distance = crtNode.distance + crtNode.weightMap.get(nei);
						nei.parent = crtNode;
					}
				}
			}
		}
		for (WeightedGraphNode crtNode : nodeList) {
			for (WeightedGraphNode nei : crtNode.neibourList) {
				if (nei.distance > crtNode.distance + crtNode.weightMap.get(nei)) {
					System.out.print("negetive cycle found !");
				}
			}
		}
		for (WeightedGraphNode node1 : nodeList) {
			System.out.print(node1 + "--" + node1.distance);
			pathParent(node1);
			System.out.println();
		}
	}

	public void flyodAlgo() {
		int size = nodeList.size();
		int[][] matrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j) {
					matrix[i][j] = 0;
				} else if (nodeList.get(i).weightMap.containsKey(nodeList.get(j))) {
					matrix[i][j] = nodeList.get(i).weightMap.get(nodeList.get(j));
				} else {
					matrix[i][j] = Integer.MAX_VALUE/10;
				}
			}
		}
		for (int k = 0; k < size; k++)
			for (int i = 0; i <size; i++) {
				for (int j = 0; j < size; j++) {
					if (matrix[i][j] > matrix[i][k] + matrix[k][j]) {
						matrix[i][j] = matrix[i][k] + matrix[k][j];
					}
				}
			}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
