package algorithms;

public class LenarSearchApp {
	
	
	public static void main(String[] args) {
		
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

}
