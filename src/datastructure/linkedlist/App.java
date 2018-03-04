package datastructure.linkedlist;

public class App {
	
	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.data = 4;
		
		Node nodeB = new Node();
		nodeB.data = 3;
		
		Node nodeC = new Node();
		nodeC.data = 7;
		
		Node nodeD = new Node();
		nodeD.data = 8;
		
		
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		
		System.out.println(printLength(nodeA));
		System.out.println(printLength(nodeB));
		System.out.println(printLength(nodeC));
		System.out.println(printLength(nodeD));
		
	}

	private static int printLength(Node node) {
		Node next = node;
		int contador = 0;
		while(next != null){
			contador++;
			next = next.next;
		}
		return contador;
	}

}
