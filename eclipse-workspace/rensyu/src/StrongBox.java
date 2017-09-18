

/**
 * @author nakamashinta
 *java実践編　5-1
 *金庫をStrongBocとして定義、金庫クラスに格納するインスタンスの型は開発時には未定
 *金庫にはは1つのインスタンスを保存できる
 *put()でインスタンスを保持し,get()でインスタンスを取得できる
 *get()で取得する際、キャストを使わなくても格納前の型に代入できる
 *5-2
 *鍵の種類を示すフィールドと
 *鍵の種類を受け取るコンストラクタを定義
 *別で列挙型KeyTypeを定義
 *金庫はget()メソッドが呼び出されるたびに回数をカウントし、各鍵が定める必要施工回数に到達しない限りnullを返す
 */
public class StrongBox<E> {
  private KeyType keyType;
  private E item;
  private long count;
  public StrongBox(KeyType Key) {
	this.keyType = Key;
  }
  public void put(E i) {
	  this.item = i;
  }
  public E get() {
	this.count++;
	switch(this.keyType) {
	case PADLOCK:
		if(count < 1024) return null;
		break;
	case BUTTON:
		if(count < 10000) return null;
		break;
	case DIAL:
		if(count < 30000) return null;
		break;
	case FINGER:
		if(count < 100000) return null;
		break;
	}
	this.count = 0;
	return this.item;
  }
}
