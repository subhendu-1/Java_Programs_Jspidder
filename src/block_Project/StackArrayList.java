package block_Project;

import java.util.EmptyStackException;

public class StackArrayList {
	Object[] a = new Object[5];
	int count = 0;
	
	public void push(Object ele) {
		if(a.length>count) {
			incriment();
		}
		a[count++] = ele;
	}
	
	public void incriment() {
		Object[] temp = new Object[a.length+3];
		for(int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		a = temp;
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
		return a[count-1];
		
	}
	
	public Object pull() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		count--;
		Object temp = a[count];
		
		a[count] = null;
		return temp;
		
	}
}
