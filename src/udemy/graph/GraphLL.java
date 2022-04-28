package udemy.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class GraphLL {
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

	public GraphLL(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}

	public void addUndirectedEdge(int i, int j) {
		GraphNode first = nodeList.get(i);
		GraphNode second = nodeList.get(j);
		first.neibourList.add(second);
		second.neibourList.add(first);
	}

	public void bfsVisit(GraphNode node) {
		LinkedList<GraphNode> queue = new LinkedList<>();
		queue.add(node);
		while (!queue.isEmpty()) {
			GraphNode crtNode = queue.remove(0);
			crtNode.isVisited = true;
			System.out.print(crtNode.name + " ");
			for (GraphNode neighbor : crtNode.neibourList) {
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
	}

	public void dfsVisit(GraphNode node) {
		Stack<GraphNode> stack = new Stack<>();
		stack.push(node);
		while (!stack.isEmpty()) {
			GraphNode crtNode = stack.pop();
			crtNode.isVisited = true;
			System.out.print(crtNode.name + " ");
			for (GraphNode neighbor : crtNode.neibourList) {
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
		GraphNode first = nodeList.get(i);
		GraphNode second = nodeList.get(j);
		first.neibourList.add(second);
	}

	public void topologicalVisit(GraphNode node) {
		Stack<GraphNode> stack = new Stack<>();
		stack.push(node);
		while (!stack.isEmpty()) {
			GraphNode crtNode = stack.pop();
			crtNode.isVisited = true;
			System.out.print(crtNode.name + " ");
			for (GraphNode neibour : crtNode.neibourList) {
				if (!neibour.isVisited) {
					neibour.isVisited = true;
					stack.add(neibour);

				}
			}

		}
	}

	public void topologicalVisit(GraphNode node, Stack<GraphNode> stack) {
		for (GraphNode neibour : node.neibourList) {
			if (!neibour.isVisited) {
				topologicalVisit(neibour, stack);
			}
		}
		stack.push(node);
		node.isVisited = true;
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
			GraphNode crtNode = que.remove(0);
			crtNode.isVisited = true;
			System.out.println(crtNode.name);
			pathParent(crtNode);
			for (GraphNode nei : crtNode.neibourList) {
				que.add(nei);
				nei.isVisited = true;
				nei.parent = crtNode;
			}
		}
	}
}
