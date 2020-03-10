import java.util.Arrays;

/*
 * Write a function that takes as an input array of Strings and modifies array with reversed strings.
 * Input: ["abc", "def", "qw7", "12"]
 * Modified: ["cba", "fed", "7wq", "21"]
 */
public class Problem4 {
	public static void main(String[] args) {
		String[] arr = {"12", "abc", "def", "qw7", "456"};
		
		getRevString(arr);
		
	}
	
	public static String[] getRevString(String[] arrOfStr) {
		char toSwap = ' ';
		for (int i = 0; i < arrOfStr.length; i++) {
			char[] c =  arrOfStr[i].toCharArray();
			//System.out.println(c.length);
				for (int j = 0; j < c.length; ) {
					toSwap = c[0];
					c[0] = c[c.length - 1];
					c[c.length - 1] = toSwap;
					break;
				}
				arrOfStr[i] = c.toString();
				System.out.println(c);
		}
		
		return arrOfStr;
	}
}
