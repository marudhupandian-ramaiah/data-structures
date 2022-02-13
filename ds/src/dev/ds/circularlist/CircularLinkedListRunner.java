package dev.ds.circularlist;

public class CircularLinkedListRunner {

	public static void main(String[] args) {

		CircularLinkedList list = new CircularLinkedList();

		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);

		list.show();

	}

}

class CircularLinkedList {

	Node head;
	Node tail; // added to maintain tail node reference

	public void add(int data) {

		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		if (head == null) {

			head = newNode;
			tail = newNode; // tail pointing to new node along with head

			System.out.println("adding head");

		} else {

			// update tail node pointing to new node from head
			tail.next = newNode;

			// now new node will be the tail
			tail = newNode;

			// new tail will be pointing to head
			tail.next = head;

		}

	}

	public void show() {

		Node node = head;

		do {

			System.out.print(node.data + " ");
			node = node.next;

		} while (node != head);

	}

}

class Node {

	int data;
	Node next;
}
