package dev.ds.stack;

public class StackRunner {

	public static void main(String[] args) {

		Stack stack = new Stack();

		stack.peek();

		stack.push(5);
		stack.push(10);
		stack.push(15);
		stack.push(20);

		stack.show();
		stack.size();

		stack.push(25);
		stack.push(30);

		stack.show();
		stack.size();

		System.out.println("pop : " + stack.pop());

		stack.show();
		stack.size();

		stack.peek();

	}
}

class Stack {

	int capacity = 5;
	int stack[] = new int[capacity];
	int top;

	public void push(int data) {

		if (!isFull()) {
			stack[top] = data;
			top++;
		} else {
			System.out.println("stack is full. cant add " + data);
		}

	}

	public int pop() {

		int data = stack[top - 1];
		stack[top - 1] = 0;
		top--;

		return data;
	}

	public void peek() {

		if (top == 0) {
			System.out.println("stack is empty. nothing to pop");
		} else {
			System.out.println("peek : " + stack[top - 1]);
		}

	}

	public void size() {
		System.out.println("size : " + top);
	}

	public boolean isFull() {

		return top == capacity ? true : false;

	}

	public void show() {

		for (int data : stack) {
			System.out.print(data + " ");
		}
		System.out.println("");
	}

}
