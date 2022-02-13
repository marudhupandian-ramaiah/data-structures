package dev.ds.list;

public class LoopRunner {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.show();
		list.size();
		
		
		list.addLoop();
		list.show();
		list.size();
		
		
		list.checkLoop();
		
	}

}
