package udemy.Tree_BinaryTree;

public class Trie {

	public TrieNode root;

	Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode crtNode = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode temp = crtNode.childNode.get(ch);
			if (temp == null) {
				temp = new TrieNode();
				crtNode.childNode.put(ch, temp);
			}
			crtNode = temp;
		}
		crtNode.endOfTrie = true;
		System.out.println(word + " is inserted in to Trie successfully");
	}

	public boolean search(String word) {
		TrieNode crtNode = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode node = crtNode.childNode.get(ch);
			if (node == null) {
				System.out.println(word + ": is not exist Trie");
				return false;
			}
			crtNode = node;
		}
		if (crtNode.endOfTrie == true) {
			System.out.println(word + ": is exists in Trie");
			return true;
		} else {
			System.out.println(word + " is not exists in Trie only prifix existF");
		}
		return crtNode.endOfTrie;
	}

	private boolean delete(TrieNode pNode, String word, int index) {
		char ch = word.charAt(index);
		TrieNode crt = pNode.childNode.get(ch);
		boolean canDlt;
		if (crt.childNode.size() > 1) {
			delete(crt, word, index + 1);
			return false;
		}
		if (index == word.length() - 1) {
			if (crt.childNode.size() >= 1) {
				crt.endOfTrie = false;
				return false;
			} else {
				pNode.childNode.remove(ch);
				return true;
			}
		}
		if (crt.endOfTrie == true) {
			delete(crt, word, index + 1);
			return false;
		}
		canDlt = delete(crt, word, index + 1);
		if (canDlt == true) {
			pNode.childNode.remove(ch);
			return true;
		} else {
			return false;
		}

	}

	public void delete(String word) {
		if (search(word)) {
			delete(root, word, 0);
		}
	}

}
