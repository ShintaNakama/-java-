/**
 * 
 */
package rensyu;

/**
 * @author nakamashinta
 *
 */
public class Rensyu4_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbers = new int[] {3,4,9};
		System.out.println("１桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int number : numbers) {
			if(number == input) {
				System.out.println("あたり");
			}else {
				
			}
		}
	}

}
