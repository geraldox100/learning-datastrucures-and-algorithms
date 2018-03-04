package datastructure.queue;

public class Queue {
	
	private long[] values;
	private int front;
	private int rear;
	private int qtd;
	
	public Queue(int size){
		values = new long[size];
		front = 0;
		rear = -1;
		qtd = 0;
	}
	
	public void insert(long value){
		qtd++;
		values[++rear] = value;
		if(rear==values.length-1){
			rear = -1;
		}
	}
	
	public long remove(){
		qtd--;
		if(front == values.length-1){
			front = 0;
			return values[front];
		}else{
			long l = values[front];
			front++;
			return l;
		}
	}
	
	public boolean isEmpty(){
		return length() == 0;
	}
	
	public boolean isFull(){
		return length() == values.length;
	}
	
	public void view(){
		System.out.print("[ ");
		for (long v : values) {
			System.out.print(v+" ");
		}
		System.out.println("]");
	}
	
	public long length(){
		return qtd;
	}

}
