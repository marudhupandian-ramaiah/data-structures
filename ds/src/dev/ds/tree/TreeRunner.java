package dev.ds.tree;

import dev.ds.tree.Tree.Node;

public class TreeRunner {

	public static void main(String[] args) {

		Tree tree = new Tree();

		Node root = new Node(10);

		tree.insert(root, 5);
		tree.insert(root, 8);
		tree.insert(root, 3);
		tree.insert(root, 12);
		tree.insert(root, 6);
		tree.insert(root, 21);
		tree.insert(root, 7);
		tree.insert(root, 4);
		tree.insert(root, 17);

		System.out.println("\nIn order traversal");
		tree.traverseInOrderTree(root);
		
		System.out.println("\nPre order traversal");
		tree.traversePreOrderTree(root);
		
		System.out.println("\nPost order traversal");
		tree.traversePostOrderTree(root);
		
	}

}

class Tree {

	static class Node {

		int data;
		Node left;
		Node right;

		Node(int data) {

			this.data = data;
			this.left = null;
			this.right = null;

		}

	}

	public void insert(Node node, int data) {

		if (node.data > data) {

			if (node.left == null) {

				Node newNode = new Node(data);
				node.left = newNode;

				System.out.println("Node added on left with value " + data + " under " + node.data);

			} else {

				insert(node.left, data);
			}

		} else {

			if (node.right == null) {

				Node newNode = new Node(data);
				node.right = newNode;

				System.out.println("Node added on right with value " + data + " under " + node.data);

			} else {

				insert(node.right, data);
			}

		}

	}

	public void traverseInOrderTree(Node root) {

		// in-order
		if (root != null) {

			traverseInOrderTree(root.left);
			System.out.print(" " + root.data);
			traverseInOrderTree(root.right);

		}

	}
	
	public void traversePreOrderTree(Node root) {

		// pre-order
		if (root != null) {

			System.out.print(" " + root.data);
			traversePreOrderTree(root.left);
			traversePreOrderTree(root.right);

		}

	}
	
	public void traversePostOrderTree(Node root) {

		if (root != null) {

			traversePostOrderTree(root.left);
			traversePostOrderTree(root.right);
			System.out.print(" " + root.data);

		}

	}

}