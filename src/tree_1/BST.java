package tree_1;

public class BST {

	public Node insertNode(Node node, int key) {
		Node rslt = null;
		Node newNode = new Node(key);
		if (node == null) {
			return newNode;
		} else if (key < node.key) {
			node.left = insertNode(node.left, key);
		} else if (key > node.key) {
			node.right = insertNode(node.right, key);
		}

		return node;

	}

	public Node dltNode(Node node, int key) {

		if (node== null) {
			return node;
		} else if (key < node.key) {
			node.left = dltNode(node.left, key);
		} else if (key > node.key) {
			node.right = dltNode(node.right, key);
		} else {
			if (node.left == null) {
				return node.right;
			} else if (node.right == null) {
				return node.left;
			}

			node.key = findMinVal(node.right);
			node.right = dltNode(node.right, node.key);
		}
		return node;
	}

	int findMinVal(Node node) {
		int min = node.key;
		while (node.left != null) {
			min = node.left.key;
			node = node.left;
		}
		return min;

	}

	void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			System.out.println(node.key);
			inOrder(node.right);
		}
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		BST tree = new BST();

		tree.insertNode(root, 8);
		tree.insertNode(root, 3);
		tree.insertNode(root, 1);
		tree.insertNode(root, 6);
		tree.insertNode(root, 7);
		tree.insertNode(root, 10);
		tree.insertNode(root, 14);
		tree.insertNode(root, 4);

		System.out.print("Inorder traversal: ");
		tree.inOrder(root);

		System.out.println("\n\nAfter deleting 10");
		tree.dltNode(root, 10);
		System.out.print("Inorder traversal: ");
		tree.inOrder(root);

	}

}
