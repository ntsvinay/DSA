
package udemy.Tree_BinaryTree;

import java.util.ArrayList;

public class BTNode {
	String data;
	ArrayList<BTNode> child;

	public BTNode(String tNode) {
		this.data = tNode;
		this.child = new ArrayList<>();
	}

	public void addNode(BTNode tNode) {
		child.add(tNode);
	}

	public String print(int level) {
		String ref = data;
		for (BTNode val : this.child) {
			System.out.println(val.data);
			ref += val.print(level + 1);
		}

		return ref;
	}

}
