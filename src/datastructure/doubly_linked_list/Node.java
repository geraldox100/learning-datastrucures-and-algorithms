package datastructure.doubly_linked_list;

public class Node<T> {

	private T data;
	private Node<T> next = null;
	private Node<T> previous = null;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}
	
	@Override
	public String toString() {
		return data.toString();
	}

}
