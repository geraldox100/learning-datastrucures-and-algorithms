package datastructure.queue;

public class App {
	
	public static void main(String[] args) {
		Queue q = new Queue(5);
		
		System.out.println("Empty: "+q.isEmpty());
		System.out.println("Length: "+q.length());
		
		q.insert(1);System.out.println("insert");
		q.insert(2);System.out.println("insert");
		q.insert(3);System.out.println("insert");
		q.insert(4);System.out.println("insert");
		q.insert(5);System.out.println("insert");
		System.out.println("Length: "+q.length());
		System.out.println("Full: "+q.isFull());
		
		q.view();
		
		System.out.println("Remove: "+q.remove());
		
		System.out.println("Full: "+q.isFull());
		System.out.println("Length: "+q.length());
		q.insert(99);System.out.println("insert");
		System.out.println("Length: "+q.length());
		System.out.println("Full: "+q.isFull());
		q.view();
		
		System.out.println("Length: "+q.length());
		System.out.println("Remove: "+q.remove());
		System.out.println("Remove: "+q.remove());
		System.out.println("Remove: "+q.remove());
		System.out.println("Remove: "+q.remove());
		System.out.println("Length: "+q.length());
		System.out.println("Remove: "+q.remove());
		System.out.println("Empty: "+q.isEmpty());
		System.out.println("Full: "+q.isFull());
		
	}

}
