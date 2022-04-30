package udemy.Tree_BinaryTree;

import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreeLL {
	public BinaryTreeNode node;

	public void preOrder(BinaryTreeNode level) {
		if (level == null) {
			return;
		}
		System.out.print(level.value + " ");
		preOrder(level.left);
		preOrder(level.right);

	}

	public void inOrder(BinaryTreeNode level) {
		if (level == null) {
			return;
		}
		inOrder(level.left);
		System.out.println(level.value + " ");
		inOrder(level.right);

	}

	public void postOrder(BinaryTreeNode level) {
		if (level == null) {
			return;
		}
		postOrder(level.left);
		postOrder(level.right);
		System.out.println(level.value + " ");

	}

	public void levelOrder() {
		Queue<BinaryTreeNode> que = new LinkedList<>();
		que.add(node);
		while (!que.isEmpty()) {
			BinaryTreeNode presantNode = que.remove();
			System.out.print(presantNode.value);
			if (presantNode.left != null) {
				que.add(presantNode.left);
			}
			if (presantNode.right != null) {
				que.add(presantNode.right);
			}
		}
	}

	public void searchValue(int val) {
		Queue<BinaryTreeNode> queue = new LinkedList<>();
		queue.add(node);

		while (!queue.isEmpty()) {
			BinaryTreeNode crtNode = queue.remove();
			if (crtNode.value == val) {
				System.out.println(val + " is present in the tree");
				return;
			} else {
				if (crtNode.left != null) {
					queue.add(crtNode.left);
				}
				if (crtNode.right != null) {
					queue.add(crtNode.right);
				}
			}

		}
		System.out.println(val + " is not exist.");

	}

	public void insertValue(int val) {
		BinaryTreeNode bNode = new BinaryTreeNode();
		bNode.value = val;

		if (node == null) {
			node = bNode;
			System.out.println("value is inserted");
			return;
		}
		Queue<BinaryTreeNode> queue = new LinkedList<>();
		queue.add(node);
		while (!queue.isEmpty()) {
			BinaryTreeNode crtNode = queue.remove();
			if (crtNode.left == null) {
				crtNode.left = bNode;
				System.out.println("value is inserted");
				break;

			} else if (crtNode.right == null) {
				crtNode.right = bNode;
				System.out.println("value is inserted");
				break;

			} else {
				queue.add(crtNode.left);
				queue.add(crtNode.right);

			}

		}

	}

	public BinaryTreeNode getDeepesstNode() {
		Queue<BinaryTreeNode> qTreeNodes = new LinkedList<>();
		qTreeNodes.add(node);
		BinaryTreeNode treeNode = null;
		while (!qTreeNodes.isEmpty()) {
			treeNode = qTreeNodes.remove();

			if (treeNode.left != null) {
				qTreeNodes.add(treeNode.left);
			}
			if (treeNode.right != null) {
				qTreeNodes.add(treeNode.right);
			}

		}
		return treeNode;
	}

	public void deleteDeepestNode() {

		Queue<BinaryTreeNode> qNodes = new LinkedList<>();
		qNodes.add(node);

		BinaryTreeNode preNode, crtNode = null;
		while (!qNodes.isEmpty()) {
			preNode = crtNode;
			crtNode = qNodes.remove();
			if (crtNode.left == null) {
				preNode.right = null;
				return;
			} else if (crtNode.right == null) {
				crtNode.left = null;
				return;
			}
			qNodes.add(crtNode.left);
			qNodes.add(crtNode.right);

		}

	}

	void deleteNode(int value) {

		Queue<BinaryTreeNode> queue = new LinkedList<>();
		queue.add(node);
		BinaryTreeNode preNode, node = null;
		while (!queue.isEmpty()) {
			preNode = node;
			node = queue.remove();
			if (node.value == value) {

				node.value = getDeepesstNode().value;
				deleteDeepestNode();
				System.out.println("deleted ...........");
				return;
			} else {
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
		}
		System.out.println("not exist ...........");

	}
	public boolean checkBST(BinaryTreeNode node) {
		Queue<BinaryTreeNode> qu = new LinkedList<BinaryTreeNode>();
		qu.add(node);
		while (!qu.isEmpty()) {
			BinaryTreeNode crt = qu.remove();

			if (crt.left != null) {
				if (crt.value < crt.left.value) {
					return false;
				}
				qu.add(crt.left);
			}
			if (crt.right != null) {
				if (crt.value > crt.right.value) {
					return false;
				}
				qu.add(crt.right);
			}
		}

		return true;
	}

}
