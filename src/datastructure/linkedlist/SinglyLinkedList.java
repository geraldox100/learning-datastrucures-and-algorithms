package datastructure.linkedlist;

public class SinglyLinkedList {
	
	private Node first;
	
	public void insertFirst(int data){
		Node node = new Node();
		node.data = data;
		node.next = first;
		first = node;
	}
	
	public Node delete(){
		Node temp = first;
		first = first.next;
		return temp;
	}
	
	public void display(){
		Node next = first;
		while(next != null){
			System.out.println("{ "+next.data+" }");
			next = next.next;
		}
	}
	
	public void insertLast(int data){
		Node current = first;
		while(current.next != null){
			current = current.next;
		}
		Node node = new Node();
		node.data = data;
		current.next = node;
	}


}
