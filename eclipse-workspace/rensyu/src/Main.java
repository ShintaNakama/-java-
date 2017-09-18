import java.util.ArrayList;
import java.util.*;
import java.util.Map;

/*
 * java実践練習問題3-3
 */

public class Main {

	
		
		public static void main(String[] args) {
			Map<String,Integer> heroes = new HashMap<String,Integer>();
			heroes.put("斎藤",3);
			heroes.put("鈴木",7);
			
			for(String key :heroes.keySet()) {
			    int value = heroes.get(key);
				System.out.println(key + "が倒した敵＝"+value);
			}

		}
	

}
