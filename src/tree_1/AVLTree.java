package tree_1;

class AvlNode {
	int item, height;
	AvlNode l, r;

	public AvlNode(int n) {
		// TODO Auto-generated constructor stub
		this.item = n;
		height = 1;

	}
}

public class AVLTree {

	AvlNode root;

	int height(AvlNode N) {
		if (N == null)
			return 0;
		return N.height;
	}

	int max(int a, int b) {
		return (a > b) ? a : b;
	}

	AvlNode rightRotate(AvlNode y) {
		AvlNode x = y.l;
		AvlNode T2 = x.r;
		x.r = y;
		y.l = T2;
		y.height = max(height(y.l), height(y.r)) + 1;
		x.height = max(height(x.l), height(x.r)) + 1;
		return x;
	}

	AvlNode leftRotate(AvlNode x) {
		AvlNode y = x.r;
		AvlNode T2 = y.l;
		y.l = x;
		x.r = T2;
		x.height = max(height(x.l), height(x.r)) + 1;
		y.height = max(height(y.l), height(y.r)) + 1;
		return y;
	}

	int getBalanceFactor(AvlNode N) {
		if (N == null)
			return 0;
		return height(N.l) - height(N.r);
	}

	AvlNode insertNode(AvlNode node, int key) {
		if (node == null) {
			return new AvlNode(key);

		} else if (key < node.item) {
			node.l = insertNode(node.l, key);
		} else if (key > node.item) {
			node.r = insertNode(node.r, key);
		} else {
			return node;
		}
		// updating balance factor
		node.height = 1 + max(height(node.l), height(node.r));
		int bf = getBalanceFactor(node);

		if (bf > 1) {
			if (key < node.l.item) {
				return rightRotate(node);
			} else if (key > node.r.item) {
				return leftRotate(node.l);
			} else {
				return rightRotate(node);
			}

		}
		if (bf < -1) {
			if (key > node.r.item) {
				return leftRotate(node);
			} else if (key < node.l.item) {
				return rightRotate(node.r);
			} else {
				leftRotate(node);
			}

		}
		return node;
	}

	AvlNode dltNode(AvlNode node, int val) {

		if (node == null) {
			return node;
		} else if (val < node.item) {
			node.l = dltNode(node.l, val);
		} else if (val > node.item) {
			node.r = dltNode(node.r, val);
		} else {
			if (node.r == null || node.l == null) {
				AvlNode tempNode = null;
				if (tempNode == node.l) {
					tempNode = node.r;
				} else {
					tempNode = node.l;
				}
				if (tempNode == null) {
					tempNode = node;
					node = null;

				} else {
					node = tempNode;
				}
			} else {
				AvlNode tempNode = nodeMinimumVal(node.r);
				node.item = tempNode.item;
				node.r = dltNode(node.r, tempNode.item);
			}
		}
		if (node == null) {
			return node;
		}

		node.height = 1 + max(height(node.l), height(node.r));
		int bf = getBalanceFactor(node);
		if (bf < -1) {
			if (getBalanceFactor(node) <= 0) {
				return leftRotate(node);
			} else {
				node.r = rightRotate(node.r);
				return leftRotate(node);
			}

		}
		if (bf > 1) {
			if (getBalanceFactor(node.l) >= 0) {
				return rightRotate(node);
			} else {
				node.l = leftRotate(node.l);
				return rightRotate(node);
			}

		}
		return node;

	}

	AvlNode nodeMinimumVal(AvlNode node) {
		while (node.l != null) {
			node = node.l;
		}
		return node;

	}

	static void preOrder(AvlNode node) {
		if (node != null) {
			preOrder(node.l);
			System.out.print(node.item + " ");
//			preOrder(node.l);
			preOrder(node.r);
		}
	}

	public static void main(String[] args) {
		AVLTree tree = new AVLTree();
		tree.root = tree.insertNode(tree.root, 33);
		tree.root = tree.insertNode(tree.root, 13);
		tree.root = tree.insertNode(tree.root, 53);
		tree.root = tree.insertNode(tree.root, 9);
		tree.root = tree.insertNode(tree.root, 21);
		tree.root = tree.insertNode(tree.root, 61);
		tree.root = tree.insertNode(tree.root, 8);
		tree.root = tree.insertNode(tree.root, 11);
		// tree.printTree(tree.root, "", true);
		preOrder(tree.root);
		tree.root = tree.dltNode(tree.root, 13);
		System.out.println("After Deletion: ");
		preOrder(tree.root);
		//tree.printTree(tree.root, "", true);
	}

}
