/**
 * 
 */
package rensyu;

/**
 * @author nakamashinta
 *
 */
public class Rensyu5_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10.0, 5.0);
		//doubleデータ型の変数三角形の面積 = メソッド名(引数リスト：底辺の長さ、高さの値)
		System.out.println("三角形の面積：" + triangleArea + "平方cm");
		//出力内容
		double circleArea = calcCircleArea(5.0);
		//doubleデータ型の変数円形の面積 = メソッド名(引数リスト：半径の値)
		System.out.println("円の面積：" + circleArea + "平方cm");
		//出力内容
	}
	//doubleデータ型メソッド名（引数リスト・・・）
	public static double calcTriangleArea(double bottom,double height) {
		//メソッドが実行された時の処理
		double area = (bottom * height) / 2;
		//戻り値
		return area;
	}
    public static double calcCircleArea (double radius) {
    	double area = radius * radius * 3.14;
    	return area;
    }
}
