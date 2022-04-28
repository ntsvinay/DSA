package udemy.graph;

import java.util.ArrayList;

public class GraphNode{
	public String name;
	public int index;
	public boolean isVisited = false;

	public ArrayList<GraphNode> neibourList = new ArrayList<GraphNode>();
	public GraphNode parent;

	public GraphNode(String name, int index) {
		this.name = name;
		this.index = index;
	}

}
