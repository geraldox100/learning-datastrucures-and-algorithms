package datastructure.doubly_linked_list;

public class App1 {

	public static void main(String[] args) {
//		teste01();
//		teste02();
//		teste03();
//		teste04();
		teste05();
	}
	
	public static void teste05() {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		
		list.delete(3);
		
		list.display();
	}
	
	public static void teste04() {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		
		list.insertAfter(3,99);
		list.insertBefore(3,88);
		
		list.display();
	}
	
	public static void teste03() {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.display();
		System.out.println();
		list.reverseDisplay();
	}

	public static void teste02() {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.display();
		System.out.println();
		
		list.deleteFirst();
		list.insertFirst(5);
		list.deleteLast();
		list.insertLast(6);
		
		list.display();
	}
	public static void teste01() {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		
		list.insertFirst(100);
		list.insertFirst(50);
		list.insertFirst(99);
		list.insertFirst(88);
		list.insertLast(99999999);
		list.insertLast(8888);
		list.insertFirst(1232);
		list.display();
		
		System.out.println();
		System.out.println();
		
		System.out.println(list.getFirst());
		System.out.println(list.getFirst().getPrevious());
		System.out.println(list.getFirst().getNext());
		System.out.println(list.getFirst().getNext().getNext());
		System.out.println(list.getFirst().getNext().getNext().getNext());
		System.out.println(list.getFirst().getNext().getNext().getNext().getNext());
		System.out.println(list.getFirst().getNext().getNext().getNext().getNext().getNext());
		System.out.println(list.getFirst().getNext().getNext().getNext().getNext().getNext().getNext());
		System.out.println(list.getFirst().getNext().getNext().getNext().getNext().getNext().getNext().getNext());
		
		System.out.println();
		System.out.println();
		
		System.out.println(list.getLast());
		System.out.println(list.getLast().getNext());
		System.out.println(list.getLast().getPrevious());
		System.out.println(list.getLast().getPrevious().getPrevious());
		System.out.println(list.getLast().getPrevious().getPrevious().getPrevious());
		System.out.println(list.getLast().getPrevious().getPrevious().getPrevious().getPrevious());
		System.out.println(list.getLast().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious());
		System.out.println(list.getLast().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious());
		System.out.println(list.getLast().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious());
	}

}
