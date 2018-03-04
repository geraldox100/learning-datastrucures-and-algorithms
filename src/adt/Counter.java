package adt;

public class Counter {
	
	private String name;
	private int counterValue=0;

	public Counter(String name) {
		this.name = name;
	}
	
	public void increment(){
		counterValue++;
	}
	
	public int getCurrentValue(){
		return counterValue;
	}

	@Override
	public String toString() {
		return "Counter [name=" + name + ", counterValue=" + counterValue + "]";
	}
	
	

}
