/**
 * 
 */
package rensyu2;

/**
 * @author nakamashinta
 *folderとfileを連結させるメソッドを作成。
 *ただしfolderは末尾に￥記号がつく場合と付いていない場合があるので付いていない場合は￥をつける
 */
public class Rensyu {
  String concatPath(String folder, String file) {
	if(!folder.endsWith("¥¥")){
	  folder += "¥¥"	;
	}
  return file;
  }
}
