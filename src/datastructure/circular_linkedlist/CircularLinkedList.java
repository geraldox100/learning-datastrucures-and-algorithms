package datastructure.circular_linkedlist;

public class CircularLinkedList<T> {

	private Node<T> first;
	private Node<T> last;

	public void insertFirst(T data) {
		Node<T> node = new Node<>();
		node.setData(data);
		node.setNext(first);
		first = node;
		if (isEmpty()) {
			last = node;
		}

	}

	public Node<T> deleteFirst() {
		Node<T> temp = first;
		
		if(first.getNext() == null){
			last = null;
		}
		
		first = first.getNext();
		return temp;
	}
	
	public Node<T> deleteLast() {
		last.getNext().getData();
		return null;
	}

	public void display() {
		Node<T> next = first;
		while (next != null) {
			System.out.println("{ " + next.getData() + " }");
			next = next.getNext();
		}
	}

	public void insertLast(T data) {
		if (isEmpty()) {
			insertFirst(data);
		}else{
			Node<T> node = new Node<>();
			node.setData(data);
			last.setNext(node);
			last = node;
		}
	}
	
	public boolean isEmpty(){
		return last == null;
	}

}
