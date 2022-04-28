package udemy.Tree_BinaryTree;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
	Map<Character, TrieNode> childNode;
	boolean endOfTrie;

	public TrieNode() {
		// TODO Auto-generated constructor stub
		childNode = new HashMap<Character, TrieNode>();
		endOfTrie = false;
	}

}
