package adt;

public class App {
	
	public static void main(String[] args) {
		Counter c = new Counter("myCounter");
		
		System.out.println(c);
		c.increment();
		c.increment();
		c.increment();
		c.increment();
		
		System.out.println(c);
		c.increment();
		System.out.println(c);
		
		
	}

}
