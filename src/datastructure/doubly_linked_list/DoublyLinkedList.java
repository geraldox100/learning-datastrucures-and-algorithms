package datastructure.doubly_linked_list;

public class DoublyLinkedList<T> {

	private Node<T> first;
	private Node<T> last;

	public void insertFirst(T data) {
		Node<T> node = new Node<>();
		node.setData(data);
		
		if(first != null){
			first.setPrevious(node);
		}
		
		node.setNext(first);
		first = node;
		if (isEmpty()) {
			last = node;
			first.setPrevious(null);
			last.setNext(null);
		}

	}
	
	public void insertLast(T data) {
		if (isEmpty()) {
			insertFirst(data);
		}else{
			Node<T> node = new Node<>();
			node.setData(data);
			node.setPrevious(last);
			last.setNext(node);
			last = node; 
		}
	}
	
	public boolean insertAfter(T referenceValue, T newValue) {
		boolean returnValue = true;
		if (isEmpty()) {
			insertFirst(newValue);
		}else{
			Node<T> referenceNode = findNodeWithValue(referenceValue);
			if(referenceNode != null){
				Node<T> nextToReferenceNode = referenceNode.getNext();
				
				Node<T> node = new Node<>();
				node.setData(newValue);
				
				referenceNode.setNext(node);
				node.setPrevious(referenceNode);
				node.setNext(nextToReferenceNode);
				nextToReferenceNode.setPrevious(node);
				
			}else{
				returnValue = false;
			}
		}
		return returnValue;
	}
	
	public boolean insertBefore(T referenceValue, T newValue) {
		boolean returnValue = true;
		if (isEmpty()) {
			insertFirst(newValue);
		}else{
			Node<T> referenceNode = findNodeWithValue(referenceValue);
			if(referenceNode != null){
				Node<T> previousToReferenceNode = referenceNode.getPrevious();
				
				Node<T> node = new Node<>();
				node.setData(newValue);
				
				node.setPrevious(previousToReferenceNode);
				referenceNode.setPrevious(node);
				node.setNext(referenceNode);
				previousToReferenceNode.setNext(node);
				
			}else{
				returnValue = false;
			}
		}
		return returnValue;
	}

	private Node<T> findNodeWithValue(T referenceValue) {
		Node<T> next = first;
		while (next != null) {
			if(next.getData().equals(referenceValue)){
				return next;
			}
			next = next.getNext();
		}
		return null;
	}
	
	public void delete(T referenceValue) {
		Node<T> referenceNode = findNodeWithValue(referenceValue);
		
		Node<T> next = referenceNode.getNext();
		Node<T> previous = referenceNode.getPrevious();

		if(previous != null){
			previous.setNext(next);
		}else{
			first = next;
		}
		if(next != null){
			next.setPrevious(previous);
		}else{
			last = previous;
		}
		
	}

	public Node<T> deleteFirst() {
		Node<T> temp = first;
		
		if(first.getNext() == null){
			last = null;
		}
		
		first = first.getNext();
		first.setPrevious(null);
		return temp;
	}
	
	public Node<T> deleteLast() {
		Node<T> temp = last;
		
		last = last.getPrevious();
		last.setNext(null);
		
		return temp;
	}
	
	public void display() {
		Node<T> next = first;
		while (next != null) {
			System.out.println("{ " + next.getData() + " }");
			next = next.getNext();
		}
	}
	
	public void reverseDisplay() {
		Node<T> next = last;
		while (next != null) {
			System.out.println("{ " + next.getData() + " }");
			next = next.getPrevious();
		}
	}
	
	public Node<T> getFirst() {
		return first;
	}
	
	public Node<T> getLast() {
		return last;
	}
	
	public boolean isEmpty(){
		return last == null;
	}

}
