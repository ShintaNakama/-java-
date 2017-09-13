/**
 * 
 */
package rensyu;

/**
 * @author nakamashinta
 *
 */
public class Rensyu15_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			int i = Integer.parseInt("三");
		}catch(NumberFormatException e){
			System.out.println("例外NumberFormatExxeptionをcatchしました");
		}

	}

}
