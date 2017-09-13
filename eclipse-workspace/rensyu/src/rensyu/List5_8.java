/**
 * 
 */
package rensyu;

/**
 * @author nakamashinta
 *
 */
public class List5_8 {
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  System.out.println(add(add(10, 20), add(30, 40)));

	}

}
