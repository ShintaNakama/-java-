/**
 * 
 */
package rensyu2;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @author nakamashinta
 *
 */
public class Rensyu2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1.現在の日時をDate型で取得
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		//2.取得した日時情報をcalendarにセット
		c.setTime(now);
		//3.Calendarから「日」の情報を取得
		int day = c.get(Calendar.DAY_OF_MONTH);
		//取得した値に１００を足した値をCalendarの「日」にセット
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		//5.Calendarの日付情報をDate型に変換
		Date future = c.getTime();
		//6.指定された形式で表示
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(future));

	}

}
