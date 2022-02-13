package dev.ds.list;

public class LinkedListRunner {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		System.out.println("list empty ? " + list.isEmpty());
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);

		list.show();

		list.addAtFirst(30);
		list.show();

		list.addAtFirst(35);
		list.show();

		list.addAtIndex(40, 3);
		list.show();

		list.addAtIndex(45, 5);
		list.show();

		list.remove(3);
		list.show();

		list.remove(0);
		list.show();

		System.out.println("list empty ? " + list.isEmpty());
		list.size();
	}

}

class LinkedList {

	Node head;

	public void add(int data) {

		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		if (head == null) {

			head = newNode;

			System.out.println("adding head");

		} else {

			Node nodePtr = head;

			while (nodePtr.next != null) {

				nodePtr = nodePtr.next;

			}

			nodePtr.next = newNode;

			System.out.println("adding element at rear or last");

		}

	}

	public void addAtFirst(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		System.out.println("adding element at first as head (old :" + head.data + ", new : " + node.data + ")");

		// update to point old head
		node.next = head;

		// change new head
		head = node;

	}

	public void addAtIndex(int data, int index) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		Node nodePtr = head;

		for (int i = 0; i < index - 1; i++) {
			// System.out.println("current node data : "+nodePtr.data);
			nodePtr = nodePtr.next;
		}

		node.next = nodePtr.next;
		nodePtr.next = node;

		System.out.println("adding element at position " + index + " with value : " + node.data);

	}

	public void remove(int index) {

		Node node = head;

		if (index == 0) {
			head = head.next;
		} else {
			for (int x = 0; x < index - 1; x++) {

				node = node.next;

			}
		}
		System.out.println("remove element at index " + index + " with value " + node.next.data);

		node.next = node.next.next;

	}

	public void size() {

		Node node = head;
		int size = 0;

		while (node.next != null) {
			node = node.next;
			size++;
		}
		size++;
		System.out.println("No of elements in list : " + size);
	}

	public void show() {

		Node node = head;

		while (node.next != null) {

			System.out.print(node.data + " ");
			node = node.next;

		}
		System.out.print(node.data + "\n");

	}

	public boolean isEmpty() {

		return head == null ? true : false;

	}
	
	public void addLoop() {
	
		System.out.println("adding loop");
		Node node = head;
		Node prev = null;
		
		while(node.next!=null) {
			
			prev = node;
			node = node.next;
			System.out.println("node:"+node.data+"--prev:"+prev.data);
			
		}
		
		node.next = prev;
		System.out.println("added loop as "+node.next.data +" referring "+prev.data);
	}
	
	public void checkLoop() {
		
		System.out.println("checking loop");
		Node node = head;
		boolean flag = false;
		
		while(node.next!=null) {
			
			node = node.next;
			
			if(node.next==null) {
				flag=true;
			}
		}
		System.out.println("loop detected : "+ flag);
	}
	

}

class Node {

	int data;
	Node next;
}
