package datastructure.stack;

public class App {
	
	public static void main(String[] args) {
		System.out.println("stack 01");
		
		Stack01 stack01 = new Stack01(5);
		stack01.push(1);
		stack01.push(2);
		stack01.push(3);
		stack01.push(4);
		stack01.push(5);
		
		while(!stack01.isEmpty()){
			System.out.println(stack01.pop());
		}
		
		System.out.println("stack 02");
		
		Stack02<Integer> stack02 = new Stack02<>();
		stack02.push(1);
		stack02.push(2);
		stack02.push(3);
		stack02.push(4);
		stack02.push(5);
		
		while(!stack02.isEmpty()){
			System.out.println(stack02.pop());
		}

		System.out.println(reverseString("hello"));
	}

	private static String reverseString(String string) {
		String retorno = "";
		Stack02<String> stack= new Stack02<String>();
		char[] charArray = string.toCharArray();
		for (char c : charArray) {
			stack.push(c+"");
		}
		
		while(!stack.isEmpty()){
			retorno+=stack.pop();
		}
		return retorno;
	}

}
