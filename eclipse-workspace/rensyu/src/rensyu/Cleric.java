/**
 * 
 */
package rensyu;

import java.util.Random;

/**
 * @author nakamashinta
 *
 */
public class Cleric {
  String name;
  int hp = 50;
  final int maxHp = 50;
  int mp = 10;
  final int maxMp = 10;
  
  public void  selfAid() {
	  System.out.println(this.name + "はセルフエイドを唱えた！");
	  this.mp = -5;
	  this.hp = maxHp;
	  System.out.println("HPが最大まで回復した");
  }
  public int play(int sec) {
	  System.out.println(this.name + "は" + sec + "秒間祈った！");
	  
	  int recover = new Random().nextInt(3) + sec;
	  
	  int recoverActual = Math.min(this.maxMp - this.mp, recover);
      
	  this.mp += recoverActual;
	  System.out.println("MPが" + recoverActual + "回復した");
	  return recoverActual;
  }
}
