/*
 * Write a function that takes two numbers a and b, where ‘b’ is incremented or decremented by some percentage of ‘a’. 
 * The task is to find out that percentage and return it.
 * Input: a = 25, b = 20
 * Output: -20%
 */
public class Problem2 {
	public static void main(String[] args) {
		System.out.println(findPercentage(200, 180));	
	}	
	
	public static double findPercentage(int a, int b) {
		double perc;	
		perc = 100 * (b - a)/Math.abs(a);
		return perc;
	}
}
