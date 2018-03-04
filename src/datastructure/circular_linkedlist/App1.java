package datastructure.circular_linkedlist;

public class App1 {

	public static void main(String[] args) {
		CircularLinkedList<Integer> list = new CircularLinkedList<>();
		
		list.insertFirst(100);
		list.insertFirst(50);
		list.insertFirst(99);
		list.insertFirst(88);
		list.insertLast(99999999);
		list.insertLast(8888);
		list.insertFirst(1232);
		
		list.display();
	}

}
