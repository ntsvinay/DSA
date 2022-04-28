package udemy.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	ArrayList<GraphNode> nodeList = new ArrayList<>();
	int[][] adjencyMat;

	public Graph(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
		adjencyMat = new int[nodeList.size()][nodeList.size()];
	}

	public void addUndirectedEdge(int i, int j) {
		adjencyMat[i][j] = 1;
		adjencyMat[j][i] = 1;

	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("   ");
		for (int i = 0; i < nodeList.size(); i++) {
			s.append(nodeList.get(i).name + " ");
		}
		s.append("\n");
		for (int i = 0; i < nodeList.size(); i++) {
			s.append(nodeList.get(i).name + ": ");
			for (int j : adjencyMat[i]) {
				s.append((j) + " ");
			}
			s.append("\n");
		}
		return s.toString();
	}

	public ArrayList<GraphNode> getNeighburNodes(GraphNode node) {
		ArrayList<GraphNode> neighbors = new ArrayList<>();
		int nodeInd = node.index;
		for (int i = 0; i < adjencyMat.length; i++) {
			if (adjencyMat[nodeInd][i] == 1) {
				neighbors.add(nodeList.get(i));
			}
		}
		return neighbors;
	}

	public void bfsVisit(GraphNode node) {
		LinkedList<GraphNode> queue = new LinkedList<>();
		queue.add(node);
		while (!queue.isEmpty()) {
			GraphNode currentNode = queue.remove(0);
			currentNode.isVisited = true;
			System.out.print(currentNode.name + "   ");
			ArrayList<GraphNode> neighbors = getNeighburNodes(currentNode);
			for (GraphNode neighbor : neighbors) {
				if (!neighbor.isVisited) {
					queue.add(neighbor);
					neighbor.isVisited = true;
				}
			}
		}

	}

	public void BFS() {
		for (GraphNode node : nodeList) {
			if (!node.isVisited) {
				bfsVisit(node);
			}
		}
		System.out.println();

	}

	public void dfsVisit(GraphNode node) {
		Stack<GraphNode> stack = new Stack<>();
		stack.push(node);
		while (!stack.isEmpty()) {
			GraphNode crtNode = stack.pop();
			crtNode.isVisited = true;
			System.out.print(crtNode.name + " ");
			ArrayList<GraphNode> neighbors = getNeighburNodes(crtNode);
			for (GraphNode neighbor : neighbors) {
				if (!neighbor.isVisited) {
					stack.add(neighbor);
					neighbor.isVisited = true;
				}
			}
		}

	}

	public void dfs() {
		for (GraphNode node : nodeList) {
			if (!node.isVisited) {
				dfsVisit(node);
			}
		}
		System.out.println();
	}

	// topological sort
	public void addDirectedEdge(int i, int j) {
		adjencyMat[i][j] = 1;
	}

	public void topologicalVisit(GraphNode node, Stack<GraphNode> stack) {
		ArrayList<GraphNode> neighbors = getNeighburNodes(node);
		for (GraphNode neighbor : neighbors) {
			if (!neighbor.isVisited) {
				topologicalVisit(neighbor, stack);
			}

		}
		node.isVisited = true;
		stack.push(node);
	}

	public void topologicalSort() {
		Stack<GraphNode> stack = new Stack<>();
		for (GraphNode node : nodeList) {
			if (!node.isVisited) {
				topologicalVisit(node, stack);
			}
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop().name + " ");
		}
	}

	public void pathParent(GraphNode node) {
		if (node.parent != null) {
			pathParent(node.parent);
		}
		System.out.print(node.name + " ");
	}

	public void bfsSSSPP(GraphNode node) {
		LinkedList<GraphNode> que = new LinkedList<>();
		que.add(node);
		while (!que.isEmpty()) {
			GraphNode crt = que.remove(0);
			crt.isVisited = true;
			System.out.println(crt.name);
			pathParent(crt);
			for (GraphNode neighbor : getNeighburNodes(crt)) {
				if (!neighbor.isVisited) {
					neighbor.isVisited = true;
					neighbor.parent = crt;
					que.add(neighbor);
				}
			}
		}
	}

}
