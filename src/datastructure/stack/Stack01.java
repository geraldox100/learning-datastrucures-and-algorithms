package datastructure.stack;

public class Stack01 {

	private int top = -1;
	private long[] values;

	public Stack01(int size) {
		values = new long[size];
	}

	public void push(long l) {
		values[++top] = l;
	}

	public long pop() {
		return values[top--];
	}

	public long peak() {
		return values[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == values.length - 1;
	}

}
