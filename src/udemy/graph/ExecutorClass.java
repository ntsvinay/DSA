package udemy.graph;

import java.util.ArrayList;

public class ExecutorClass {
	public static void main(String[] args) {
		ArrayList<GraphNode> nodeList = new ArrayList<>();
		nodeList.add(new GraphNode("A", 0));
		nodeList.add(new GraphNode("B", 1));
		nodeList.add(new GraphNode("C", 2));
		nodeList.add(new GraphNode("D", 3));
		nodeList.add(new GraphNode("E", 4));
		nodeList.add(new GraphNode("F", 5));
		nodeList.add(new GraphNode("G", 6));
		nodeList.add(new GraphNode("H", 7));
		Graph g = new Graph(nodeList);
		// GraphLL g = new GraphLL(nodeList);
		/*
		 * g.addUndirectedEdge(0, 1); g.addUndirectedEdge(0, 2); g.addUndirectedEdge(0,
		 * 3); g.addUndirectedEdge(1, 4); g.addUndirectedEdge(2, 3);
		 * g.addUndirectedEdge(3, 4);
		 */
		g.addDirectedEdge(0, 2);
		g.addDirectedEdge(1, 2);
		g.addDirectedEdge(1, 3);
		g.addDirectedEdge(2, 4);
		g.addDirectedEdge(3, 5);
		g.addDirectedEdge(4, 7);
		g.addDirectedEdge(4, 5);
		g.addDirectedEdge(5, 6);
		// System.out.println(g.toString());
		// g.BFS();
		// g.dfs();
		// g.topologicalSort();
		// g.bfsSSSPP(nodeList.get(0));

		ArrayList<WeightedGraphNode> weightedNodeList = new ArrayList<>();
		weightedNodeList.add(new WeightedGraphNode("A", 0));
		weightedNodeList.add(new WeightedGraphNode("B", 1));
		weightedNodeList.add(new WeightedGraphNode("C", 2));
		weightedNodeList.add(new WeightedGraphNode("D", 3));
		/*
		 * weightedNodeList.add(new WeightedGraphNode("E", 4)); weightedNodeList.add(new
		 * WeightedGraphNode("F", 5)); weightedNodeList.add(new WeightedGraphNode("G",
		 * 6));
		 */
		WeightedGraph newGraph = new WeightedGraph(weightedNodeList);
		newGraph.addWeightOfEdge(0, 3, 1);
		newGraph.addWeightOfEdge(0, 1, 8);
		newGraph.addWeightOfEdge(1, 2, 1);
		newGraph.addWeightOfEdge(1, 0, 4);
		newGraph.addWeightOfEdge(3, 1, 2);
		newGraph.addWeightOfEdge(3, 2, 9);
		/*
		 * newGraph.addWeightOfEdge(0, 1, 2); newGraph.addWeightOfEdge(0, 2, 5);
		 * newGraph.addWeightOfEdge(1, 2, 6); newGraph.addWeightOfEdge(1, 3, 1);
		 * newGraph.addWeightOfEdge(1, 4, 3); newGraph.addWeightOfEdge(2, 5, 8);
		 * newGraph.addWeightOfEdge(3, 4, 4); newGraph.addWeightOfEdge(4, 6, 9);
		 * newGraph.addWeightOfEdge(5, 6, 7);
		 */
		// newGraph.dijkastra(weightedNodeList.get(0));
		// newGraph.bellmonFordAlgo(weightedNodeList.get(0));
		// newGraph.flyodAlgo();
		ArrayList<WeightedGraphNode> weightedNodeListDis = new ArrayList<>();
		weightedNodeListDis.add(new WeightedGraphNode("A"));
		weightedNodeListDis.add(new WeightedGraphNode("B"));
		weightedNodeListDis.add(new WeightedGraphNode("C"));
		weightedNodeListDis.add(new WeightedGraphNode("D"));
		weightedNodeListDis.add(new WeightedGraphNode("E"));
		// DisjointSetMSTree dis=new DisjointSetMSTree();
		/*
		 * DisjointSetMSTree.makeSet(weightedNodeListDis); DisjointSetMSTree out =
		 * DisjointSetMSTree.findSet(weightedNodeListDis.get(1)); out.printSet();
		 * DisjointSetMSTree.unionNode(weightedNodeListDis.get(0),
		 * weightedNodeListDis.get(1)); out =
		 * DisjointSetMSTree.findSet(weightedNodeListDis.get(1)); out.printSet();
		 */

		// Kruskal/prims Algo Executor
		// KruskalAlgo kAlgo = new KruskalAlgo(weightedNodeListDis);
		PrimsAlgo kAlgo = new PrimsAlgo(weightedNodeListDis);
		kAlgo.addWeightedUndirectedEde(0, 1, 5);
		kAlgo.addWeightedUndirectedEde(0, 2, 13);
		kAlgo.addWeightedUndirectedEde(0, 4, 15);
		kAlgo.addWeightedUndirectedEde(1, 2, 10);
		kAlgo.addWeightedUndirectedEde(1, 3, 8);
		kAlgo.addWeightedUndirectedEde(2, 3, 6);
		kAlgo.addWeightedUndirectedEde(2, 4, 20);
		System.out.println("Running...");
		// kAlgo.kruskal();
		kAlgo.primsAlgo(weightedNodeListDis.get(4));

	}

}
