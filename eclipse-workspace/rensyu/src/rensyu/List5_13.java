/**
 * 
 */
package rensyu;

/**
 * @author nakamashinta
 *returnで返していなくても、配列をメソッドとして渡すと、呼び出し先で配列の実体を書き換えると呼び出し元にも影響する。
 */
public class List5_13 {
	//int型配列を受け取り、
	//配列内の要素全てに1を加えるメソッド
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		incArray(array);
		for(int i : array) {
			System.out.println(i);
		}
	}


}
