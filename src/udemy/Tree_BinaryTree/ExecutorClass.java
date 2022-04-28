package udemy.Tree_BinaryTree;

import java.util.Arrays;

public class ExecutorClass {
	public static void main(String[] args) {
		/*
		 * TreeNode tNode = new TreeNode("Drinks"); tNode.addNode(new TreeNode("Hot"));
		 * tNode.addNode(new TreeNode("Cold")); System.out.println(tNode.print(0));
		 */

		/*
		 * BinaryTreeLL bTree = new BinaryTreeLL(); bTree.insertValue(1);
		 * bTree.insertValue(2); bTree.insertValue(3); bTree.insertValue(4);
		 * bTree.insertValue(5); bTree.insertValue(6); // bTree.inOrder(bTree.node); //
		 * bTree.preOrder(bTree.node); // bTree.postOrder(bTree.node); //
		 * System.out.println(bTree.getDeepesstNode().value); //
		 * bTree.deleteDeepestNode(); // bTree.deleteNode(9); bTree.levelOrder();
		 * System.out.println("using arr");
		 * 
		 * BinaryTreeArr bTreeArr = new BinaryTreeArr(8); bTreeArr.insertValue(1);
		 * bTreeArr.insertValue(2); bTreeArr.insertValue(3); bTreeArr.insertValue(4);
		 * bTreeArr.insertValue(5); bTreeArr.insertValue(6); // bTreeArr.levelOrder();
		 * // bTreeArr.preOrder(1); // bTreeArr.inOrder(1); // bTreeArr.postOrder(1);
		 * bTreeArr.levelOrder(); // bTreeArr.searchElement(8);
		 * System.out.println(bTreeArr.deleteNode(3)); bTreeArr.levelOrder();
		 */
		// BSTLL bst = new BSTLL();
		// AVLTree bst=new AVLTree();
		BHeap bst = new BHeap(15);
		bst.insert(90);
		bst.insert(80);
		bst.insert(70);
		bst.insert(50);
		bst.insert(60);
		bst.insert(10);
		bst.insert(40);
		bst.insert(20);
		bst.insert(30);
		bst.insert(100);
		bst.levelOrder();
		bst.extractHeap("Max");
		System.out.println("");
		bst.levelOrder();
		// bst.preOrder(bst.rootNode);
		// bst.levelOrder(bst.node);
		// bst.delete(bst.node, 100);
		// bst.levelOrder(bst.node);
		// bst.searchNode(100);
		// bst.delete(bst.rootNode, 100);
		// bst.levelOrder(bst.rootNode);
		// bst.searchNode(100);

		Trie trie = new Trie();
		trie.insert("api");
		trie.insert("apis");
		//trie.search("api");
		trie.delete("api");
		trie.search("api");

	}

}
