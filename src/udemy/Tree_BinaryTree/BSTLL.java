package udemy.Tree_BinaryTree;

import java.util.Queue;

import java.util.LinkedList;;

public class BSTLL {

	BSTNode rootNode;

	public BSTLL() {
		rootNode = new BSTNode();
	}

	private BSTNode insert(BSTNode crtNode, int val) {
		if (crtNode == null) {
			BSTNode node = new BSTNode();
			node.value = val;
			return node;
		} else if (crtNode.value >= val) {
			crtNode.left = insert(crtNode.left, val);
			return crtNode;
		} else {
			crtNode.right = insert(crtNode.right, val);
			return crtNode;
		}
	}

	public void insert(int val) {
		insert(rootNode, val);
	}

	public void preOrder(BSTNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.value + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void inOrder(BSTNode node) {
		if (node == null) {
			return;
		}
		preOrder(node.left);
		System.out.print(node.value + " ");
		preOrder(node.right);
	}

	public void postOrder(BSTNode node) {
		if (node == null) {
			return;
		}
		preOrder(node.left);
		preOrder(node.right);
		System.out.print(node.value + " ");
	}

	public void levelOrder(BSTNode bNode) {
		Queue<BSTNode> que = new LinkedList<>();
		que.add(bNode);

		while (!que.isEmpty()) {
			BSTNode node = que.remove();
			System.out.print(node.value + " ");
			if (node.left != null) {
				que.add(node.left);
			}
			if (node.right != null) {
				que.add(node.right);
			}
		}

	}

	public void searchNode(int val) {
		Queue<BSTNode> que = new LinkedList<>();
		que.add(rootNode);
		while (!que.isEmpty()) {
			BSTNode crtNode = que.remove();
			if (crtNode.value == val) {
				System.out.println(val + ": is exist");
				return;
			}
			if (crtNode.left != null) {
				que.add(crtNode.left);
			}
			if (crtNode.right != null) {
				que.add(crtNode.right);
			}
		}
		System.out.println("Value does not exist in tree");

	}

	// Search Method
	BSTNode search(BSTNode node, int value) {
		if (node == null) {
			System.out.println("Value: " + value + " not found in BST");
			return null;
		} else if (node.value == value) {
			System.out.println("Value: " + value + " found in BST");
			return node;
		} else if (value < node.value) {
			return search(node.left, value);
		} else {
			return search(node.right, value);
		}
	}

	public BSTNode getMinimumNode(BSTNode node) {
		if (node.left == null) {
			return node;
		} else {
			return getMinimumNode(node.left);
		}
	}

	public BSTNode delete(BSTNode node, int val) {
		if (node == null) {
			System.out.println("nul");
			return null;
		}
		if (val > node.value) {
			node.right = delete(node.right, val);
		} else if (val < node.value) {
			node.left = delete(node.left, val);
		} else {
			if (node.left != null && node.right != null) {
				BSTNode temp = node;
				BSTNode minRightnode = getMinimumNode(temp.right);
				node.value = minRightnode.value;
				node.right = delete(node.right, minRightnode.value);
			} else if (node.left != null) {
				node = node.left;
			} else if (node.right != null) {
				node = node.right;
			} else {
				node = null;
			}
		}
		return node;
	}

	public boolean checkBST(BSTNode node) {
		Queue<BSTNode> qu = new LinkedList<BSTNode>();
		qu.add(node);
		while (!qu.isEmpty()) {
			BSTNode crt = qu.remove();

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
