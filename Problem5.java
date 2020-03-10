/*
 * Write a function that takes as an input nonnegative integer and returns true if the given number contains even count of zeros;
 *  otherwise, it returns false.
 *  Input: 50140
 *  Output: true
 */
import java.util.Scanner;
public class Problem5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		countZeros(x);
	}
	
	public static void countZeros(int n) {
	String str = String.valueOf(n);
		
		int count = 0;
		boolean even = false;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				even = true;
				count++;
			}
		}
		System.out.println(count%2 == 0 && even);
	}
}
