package block_Project;

public class Node {
	Node next;
	Object ele;
	
	Node(Object e,Node n){
		next = n;
		ele = e;
	}
	
	Node (Object e){
		ele = e;
		next = null;
	}
}
