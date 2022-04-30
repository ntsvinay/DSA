package udemy.Tree_BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import tree_1.BST;

public class AVLTree {
	BSTNode node;

	public AVLTree() {
		// TODO Auto-generated constructor stub
		node = null;
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

	public BSTNode search(BSTNode loc, int val) {
		BSTNode bNode;
		if (loc == null) {
			System.out.println("not exist");
			return null;
		} else {
			if (loc.value == val) {
				bNode = loc;
			} else if (loc.value >= val) {
				bNode = search(loc.left, val);
			} else {
				bNode = search(loc.right, val);
			}
		}
		return bNode;
	}

	private int getHeight(BSTNode node) {
		return node == null ? 0 : node.height;
	}

	private BSTNode insert(BSTNode node, int val) {
		if (node == null) {
			BSTNode newNode = new BSTNode();
			newNode.value = val;
			newNode.height = 1;
			return newNode;
		} else if (node.value > val) {
			node.left = insert(node.left, val);
		} else {
			node.right = insert(node.right, val);
		}
		node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
		int bal = getBal(node);
		if (bal > 1 && val < node.left.value) {
			return rightRotation(node);
		}
		if (bal > 1 && val > node.left.value) {
			node.left = leftRotation(node.left);
			return rightRotation(node.left);
		}
		if (bal < -1 && val > node.right.value) {
			return leftRotation(node);
		}
		if (bal < -1 && val < node.right.value) {
			node.right = rightRotation(node.right);
			return leftRotation(node.right);
		}
		return node;

	}

	public void insert(int val) {
		this.node = insert(node, val);
	}

	private BSTNode rightRotation(BSTNode disNode) {
		if (node == null) {
			return null;
		} else {
			BSTNode temp = disNode.left;
			disNode.left = disNode.left.right;
			temp.right = disNode;
			disNode.height = 1 + Math.max(getHeight(disNode.left), getHeight(disNode.right));
			temp.height = 1 + Math.max(getHeight(temp.left), getHeight(temp.right));
			return temp;
		}
	}

	private BSTNode leftRotation(BSTNode disNode) {
		if (node == null) {
			return null;
		} else {
			BSTNode temp = disNode.right;
			disNode.right = disNode.right.left;
			temp.left = disNode;
			disNode.height = 1 + Math.max(getHeight(disNode.left), getHeight(disNode.right));
			temp.height = 1 + Math.max(getHeight(temp.left), getHeight(temp.right));
			return temp;
		}
	}

	public int getBal(BSTNode node) {
		return node == null ? 0 : (getHeight(node.left) - getHeight(node.right));

	}

	public BSTNode getMin(BSTNode node) {
		return node == null ? node : getMin(node.left);

	}

	public BSTNode delete(BSTNode node, int val) {
		if (node == null) {
			System.out.println("empty tree");
		} else if (val > node.value) {
			node.right = delete(node.right, val);
		} else if (val < node.value) {
			node.left = delete(node.left, val);
		} else {
			if (node.left != null && node.right != null) {
				BSTNode temp = node;
				BSTNode rightMin = getMin(temp.right);
				node.value = rightMin.value;
				node.right = delete(node.right, rightMin.value);
			} else if (node.left != null) {
				node = node.left;
			} else if (node.right != null) {
				node = node.right;
			} else {
				node = null;
			}

		}
		int bal = getBal(node);
		if (bal > 1 && getBal(node.left) >= 0) {
			return rightRotation(node);
		}
		if (bal > 1 && getBal(node.left) < 0) {
			node.left = leftRotation(node);
			return rightRotation(node);
		}
		if (bal < -1 && getBal(node.right) <= 0) {
			return rightRotation(node);
		}
		if (bal < -1 && getBal(node.right) > 0) {
			node.right = rightRotation(node);
			return leftRotation(node);
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
