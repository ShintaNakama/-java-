/**
 * 
 */
package rensyu;

import java.io.IOException;

/**
 * @author nakamashinta
 *起動直後にIOExceptionを送出して異常終了する
 */
public class Rensyu15_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("プログラムが起動しました！");
		throw new IOException();
	}

}
