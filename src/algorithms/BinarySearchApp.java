package algorithms;

public class BinarySearchApp {

	public static void main(String[] args) {
		// 0 1 2 3 4 5 6 7 8 9
		int[] array = { 3, 11, 21, 29, 41, 54, 64, 78, 110, 127 };

		long inicio = System.currentTimeMillis();

		System.out.println(myBinarySearch(array, 3));
		System.out.println(myBinarySearch(array, 11));
		System.out.println(myBinarySearch(array, 21));
		System.out.println(myBinarySearch(array, 29));
		System.out.println(myBinarySearch(array, 41));
		System.out.println(myBinarySearch(array, 54));
		System.out.println(myBinarySearch(array, 64));
		System.out.println(myBinarySearch(array, 78));
		System.out.println(myBinarySearch(array, 110));
		System.out.println(myBinarySearch(array, 127));
		System.out.println(myBinarySearch(array, 300));
		System.out.println(myBinarySearch(array, 1));

		System.out.println("fim: " + (0.0 + System.currentTimeMillis() - inicio) / 1000);
		inicio = System.currentTimeMillis();

		System.out.println(binarySearch(array, 3));
		System.out.println(binarySearch(array, 11));
		System.out.println(binarySearch(array, 21));
		System.out.println(binarySearch(array, 29));
		System.out.println(binarySearch(array, 41));
		System.out.println(binarySearch(array, 54));
		System.out.println(binarySearch(array, 64));
		System.out.println(binarySearch(array, 78));
		System.out.println(binarySearch(array, 110));
		System.out.println(binarySearch(array, 127));
		System.out.println(binarySearch(array, 300));
		System.out.println(binarySearch(array, 1));
		System.out.println("fim: " + (0.0 + System.currentTimeMillis() - inicio) / 1000);

		inicio = System.currentTimeMillis();
		System.out.println("recursiveBinarySearch");
		System.out.println(recursiveBinarySearch(array, 3, 0, array.length - 1));
		System.out.println(recursiveBinarySearch(array, 11, 0, array.length - 1));
		System.out.println(recursiveBinarySearch(array, 21, 0, array.length - 1));
		System.out.println(recursiveBinarySearch(array, 29, 0, array.length - 1));
		System.out.println(recursiveBinarySearch(array, 41, 0, array.length - 1));
		System.out.println(recursiveBinarySearch(array, 54, 0, array.length - 1));
		System.out.println(recursiveBinarySearch(array, 64, 0, array.length - 1));
		System.out.println(recursiveBinarySearch(array, 78, 0, array.length - 1));
		System.out.println(recursiveBinarySearch(array, 110, 0, array.length - 1));
		System.out.println(recursiveBinarySearch(array, 127, 0, array.length - 1));
		System.out.println(recursiveBinarySearch(array, 300, 0, array.length - 1));
		System.out.println(recursiveBinarySearch(array, 1, 0, array.length - 1));
		System.out.println("fim: " + (0.0 + System.currentTimeMillis() - inicio) / 1000);

	}

	private static int recursiveBinarySearch(int[] array, int i, int p, int r) {
		if (p <= r) {
			int q = (p + r) / 2;
			if (i > array[q])
				return recursiveBinarySearch(array, i, q + 1, r);
			else if (i < array[q])
				return recursiveBinarySearch(array, i, p, q - 1);
			else
				return q;
		}

		return -1;
	}

	private static int binarySearch(int[] array, int i) {
		int p = 0;
		int r = array.length - 1;
		while (p <= r) {
			int q = (p + r) / 2;
			if (i > array[q])
				p = q + 1;
			else if (i < array[q])
				r = q - 1;
			else
				return q;
		}

		return -1;
	}

	private static int myBinarySearch(int[] array, int i) {
		int middle = array.length / 2;

		// int tentativa = 0;
		while (true) {

			if (middle > array.length - 1 || middle < 0) {
				// System.out.println("tentativas: "+tentativa);
				return -1;
			}

			if (array[middle] == i) {
				// System.out.println("tentativas: "+tentativa);
				return middle;
			}

			if (middle == array.length - 1) {
				middle--;
			} else {

				if (i > array[middle]) {
					middle = middle + (middle / 2);
					if (middle == array.length) {
						middle--;
					}
				} else {
					middle = middle - ((middle / 2) == 0 ? 1 : (middle / 2));
				}
			}
			// tentativa++;

		}
	}

}
