/**
 * 
 */
package rensyu2;

/**
 * @author nakamashinta
 *
 */
public class Rensyu1_1 {

	/**
	 * @param args
	 * 1から100までの整数をカンマで連結した文字列
	 * 完成した文字列はカンマで分割しStirng配列に格納
	 */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i =0; i < 100; i++) {
			sb.append(i+1).append(",");
		}
		String s = sb.toString();
		String[] a = s.split(",");
		System.out.println(sb);
	}

}
