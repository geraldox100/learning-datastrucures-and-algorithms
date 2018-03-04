package datastructure.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack02<T> {

	private int top = -1;
	private List<T> values = new ArrayList<>();

	public void push(T l) {
		values.add(++top, l);
	}

	public T pop() {
		return values.remove(top--);
	}

	public T peak() {
		return values.get(top);
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == values.size() - 1;
	}

}
