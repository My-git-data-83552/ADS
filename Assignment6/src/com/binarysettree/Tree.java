package com.binarysettree;

public class Tree {

	public static class Node {
		private int data;
		private Node left, right;

		public Node(int value) {
			data = value;
			left = right = null;
		}
	}

	private Node root;

	public Tree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {
		Node newnode = new Node(value);

		if (isEmpty())
			root = newnode;
		else {
			Node trav = root;
			// check 3 condition regarding value and current node data
			while (true) {
				if (value < trav.data) {
					if (trav.left == null) {
						trav.left = newnode;
						break;
					} else
						trav = trav.left;
				} else {
					if (trav.right == null) {
						trav.right = newnode;
						break;
					} else
						trav = trav.right;
				}
			}
		}
	}

	public void addNodeRecursion(int value, Node trav) {
		Node newnode = new Node(value);

		if (isEmpty())
			root = newnode;

		if (trav == null)
			return;

		if (value < trav.data) {
			if (trav.left == null) {
				trav.left = newnode;
				return;
			} else
				trav = trav.left;
		} else {
			if (trav.right == null) {
				trav.right = newnode;
				return;

			} else
				trav = trav.right;
		}
		addNodeRecursion(value, trav);
	}

	public void addNodeRecursion(int value) {
		addNodeRecursion(value, root);
	}

	public void preOrder(Node trav) {
		if (trav == null)
			return;

		System.out.print(trav.data + " ");
		preOrder(trav.left);
		preOrder(trav.right);
	}

	public void preOrder() {     
		preOrder(root);
	}

	public void inOrder(Node trav) {
		if (trav == null)
			return;
		inOrder(trav.left);
		System.out.print(trav.data + " ");
		inOrder(trav.right);
	}

	public void inOrder() {
		inOrder(root);
	}

	public void postOrder(Node trav) {
		if (trav == null)
			return;
		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print(trav.data + " ");
	}

	public void postOrder() {
		postOrder(root);
	}

	public Node binarySearch(int key) {
		Node trav = root;
		while (trav != null) {
			if (trav.data == key)
				return trav;
			else if (key < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		return null;
	}

	public Node RecursiveBinarySearch(int key, Node trav) {
		if (trav.data == key)
			return trav;
		else if (key < trav.data)
			if (trav.left != null)
				RecursiveBinarySearch(key, trav.left);
			else {
				if (trav.left != null)
					RecursiveBinarySearch(key, trav.right);
			}
		return null;
	}

	public Node RecursiveBinarySearch(int key) {
		return RecursiveBinarySearch(key, root);
	}

	public Node[] binarySearchWithParent(int key) {
		Node trav = root;
		Node parent = null;

		while (trav != null) {
			if (key == trav.data)
				break;
			parent = trav;
			if (key < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		if (trav == null)
			parent = null;
		return new Node[] { trav, parent };
	}

	public void deletePredecessor(int key) {
		Node arr[] = binarySearchWithParent(key);
		Node nodeToDelete = arr[0];
		Node parentOfNodeToDelete = arr[1];
		Node pred = root;

		// delete node with single child on the left
		if (isEmpty())
			return;
		if (nodeToDelete.left == null) {
			if (nodeToDelete == root)
				root = null;
			else if (parentOfNodeToDelete.left == nodeToDelete)
				parentOfNodeToDelete.left = nodeToDelete.left;
			else // if(parentOfNodeToDelete.right==nodeToDelete)
				parentOfNodeToDelete.right = nodeToDelete.left;
		}
		if (nodeToDelete.left == null) {
			if (nodeToDelete == root)
				root = null;
			else if (parentOfNodeToDelete.left == nodeToDelete)
				parentOfNodeToDelete.left = nodeToDelete.left;
			else // if(parentOfNodeToDelete.right==nodeToDelete)
				parentOfNodeToDelete.right = nodeToDelete.left;
		}
	}
}
