/**
 * 
 */
package rensyu2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author nakamashinta
 *java8以降のTimeAPI方式
 */
public class Rensyu2_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//現在の年月日を取得
		LocalDate now= LocalDate.now();
		//100日後の値をfutureに代入
		LocalDate future = now.plusDays(100);
		//DateTimeFormatter型、変数fに引数の内容を
		DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		//100日後の値を前述に指定した引数の内容で出力
		System.out.println(future.format(f));
      
	}
}
