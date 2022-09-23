package de.hska.iwi.ads.solution.tree;

import de.hska.iwi.ads.dictionary.AbstractBinaryTree;

public class BinarySearchTree<K extends Comparable<K>, V> extends AbstractBinaryTree<K, V> {
	
	private Node getNode(K requestedKey, Node currentNode) {
		
		// if root node is null tree is empty
		if (currentNode == null) {
			return null;
		}
		
		if (requestedKey.equals(currentNode.entry.getKey())) {
			return currentNode;
		}

		if (requestedKey.compareTo(currentNode.entry.getKey()) > 0) {
			if (currentNode.right == null) {
				// key does not exist
				return null;
			}
			return getNode(requestedKey, currentNode.right);
		}

		if (requestedKey.compareTo(currentNode.entry.getKey()) < 0) {
			if (currentNode.left == null) {
				// key does not exist
				return null;
			}
			return getNode(requestedKey, currentNode.left);
		}
		
		return null;
	}

	@SuppressWarnings("unchecked")
	public V get(Object o) {
		K requestedKey = (K) o;
		Node requestedNode = getNode(requestedKey, this.root);
		if (requestedNode != null) {
			V requestedValue = requestedNode.entry.getValue();
			return requestedValue;
		}
		// a node with that key not found
		return null;
	}
	
	public V putNode(K key, V value, Node currentNode) {
		
		// if root node is null
		if (currentNode == null) {
			// create a node here
			// currentNode = new Node(key,value); // this does not work beacuse java is pass by value, not pass by reference
			this.root = new Node(key,value);
			this.size = this.size + 1;
			return null;
		}
		
		if (key.equals(currentNode.entry.getKey())) {
			// overwrite the old value
			V oldValue = currentNode.entry.getValue();
			currentNode.entry.setValue(value);
			return oldValue;
		}

		if (key.compareTo(currentNode.entry.getKey()) > 0) {
			if (currentNode.right == null) {
				// key does not exist
				// create a node here
				currentNode.right = new Node(key,value);
				this.size = this.size + 1;
				return null;
			}
			return putNode(key, value, currentNode.right);
		}

		if (key.compareTo(currentNode.entry.getKey()) < 0) {
			if (currentNode.left == null) {
				// key does not exist
				// create a node here
				currentNode.left = new Node(key,value);
				this.size = this.size + 1;
				return null;
			}
			return putNode(key,value, currentNode.left);
		}
		
		return null;
	
	}

	public V put(K key, V value) {
		Node currentNode = this.root;
		return putNode(key, value, currentNode);
	}
}
