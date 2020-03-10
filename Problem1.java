/*
 * Write a function that takes as an input nonnegative integer and returns the sum of the digits in an integer.
 * Input: 684
 * Output: The sum is 18
 */
import java.util.Scanner;
public class Problem1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int y = scanner.nextInt();		
		
		System.out.println(getSumOfDigits(y));
	}
	
	public static int getSumOfDigits(int n){
		int sum = 0;
		int x = 0;
		for (int i = 1000; i > 0; i/=10) {
			x = n / i;
			n = n % i;
			sum =  sum + x;
		}
		return sum;
	}
}
