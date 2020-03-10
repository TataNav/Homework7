/*
 * Write a function that takes an integer and array as inputs and returns the index of the first occurrence of the given integer in array.
 * If the number does not exist return -1.
 * Input: (8, [75, 54, 8, -3, 2, 8, 67])
 * Output: 2
 */
public class Problem3 {
	public static void main(String[] args) {
		int myArray[] = {1, 5, -55, 2, 46, 5};
		
		getIndex(-3, myArray);
	}

	public static void getIndex(int n, int[] arr) {
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				found = true;
				break;
			}
		}
		
		if (found) {
			System.out.println(n);
		} else {
			System.out.println("-1");
		}		
	}
}
