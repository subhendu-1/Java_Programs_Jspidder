package block_Project;

public class StacDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArrayList s = new StackArrayList();
		s.push(20);
		s.push(30);
		s.push(40);
		
//		StackLinkedList s = new StackLinkedList();
//		s.push(20);
//		s.push(30);
//		s.push(40);
		System.out.println(s.peek());
		
		while(!s.isEmpty()) {
			System.out.println(s.pull());
		}
	}

}
