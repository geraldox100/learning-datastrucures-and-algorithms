package algorithms;

public class LenarSearchApp {
	
	
	public static void main(String[] args) {
		// 0 1 2 3 4 5 6 7 8 9
		int[] array = { 3, 11, 21, 29, 41, 54, 64, 78, 110, 127 };
				
		long inicio = System.currentTimeMillis();

		System.out.println(recursiveLinearSearch(array, 0, 3));
		System.out.println(recursiveLinearSearch(array, 0, 11));
		System.out.println(recursiveLinearSearch(array, 0, 21));
		System.out.println(recursiveLinearSearch(array, 0, 29));
		System.out.println(recursiveLinearSearch(array, 0, 41));
		System.out.println(recursiveLinearSearch(array, 0, 54));
		System.out.println(recursiveLinearSearch(array, 0, 64));
		System.out.println(recursiveLinearSearch(array, 0, 78));
		System.out.println(recursiveLinearSearch(array, 0, 110));
		System.out.println(recursiveLinearSearch(array, 0, 127));
		System.out.println(recursiveLinearSearch(array, 0, 300));
		System.out.println(recursiveLinearSearch(array, 0, 1));
		
		System.out.println("fim: " + (0.0 + System.currentTimeMillis() - inicio) / 1000);
	}
	
	
	//O(n)
	public static int linearSearch(int[] a, int x){
		for (int i = 0; i < a.length; i++) {
			if(a[i] == x){
				return i;
			}
		}
		return -1;
	}
	
	
	private static int recursiveLinearSearch(int[] array, int i, int x) {
		int n = array.length-1;
		if (i > n)
			return -1;
		else if (array[i] == x)
			return i;
		else
			return recursiveLinearSearch(array, i + 1, x);
	}
			

}
