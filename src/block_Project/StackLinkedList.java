package block_Project;

import java.util.EmptyStackException;

public class StackLinkedList {
	Node first = null;
	int count = 0;
	
	public void push(Object ele) {
		if(first == null) {
			first = new Node(ele);
			count++;
			return;
		}
		first = new Node(ele,first);
		count++;
		
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public Object peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		return first.ele;
	}
	
	public Object pull() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		Object temp = first.ele;
		first = first.next;
		count--;
		return temp;
	}
}
