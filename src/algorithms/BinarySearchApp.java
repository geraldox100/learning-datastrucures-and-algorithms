package algorithms;

import java.util.Arrays;

public class BinarySearchApp {
	
	public static void main(String[] args) {
		//				0 1  2  3   4  5  6  7  8  9	
		int[]  array = {3,11,21,29,41,54,64,78,110,127};
		
		System.out.println(findIndex(array, 3));
		System.out.println(findIndex(array, 11));
		System.out.println(findIndex(array, 21));
		System.out.println(findIndex(array, 29));
		System.out.println(findIndex(array, 41));
		System.out.println(findIndex(array, 54));
		System.out.println(findIndex(array, 64));
		System.out.println(findIndex(array, 78));
		System.out.println(findIndex(array, 110));
		System.out.println(findIndex(array, 127));
		System.out.println(findIndex(array, 300));
		System.out.println(findIndex(array, 1));
		
	}

	private static int findIndex(int[] array, int i) {
		int middle = array.length / 2;
		
		int tentativa = 0;
		while(true){
			
			if(middle > array.length -1 || middle < 0){
				System.out.println("tentativas: "+tentativa);
				return -1;
			}
			
			if(array[middle] == i){
				System.out.println("tentativas: "+tentativa);
				return middle;
			}
			
			if(middle == array.length -1){
				middle--;
			}else{
				
				if(i > array[middle]){
					middle = middle + (middle/2);
					if(middle == array.length){
						middle--;
					}
				}else{
					middle = middle - ((middle/2) == 0 ?1 : (middle/2));
				}
			}
			tentativa++;
			
		}
	}

}
