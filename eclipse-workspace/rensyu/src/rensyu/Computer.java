/**
 * 
 */
package rensyu;

/**
 * @author nakamashinta
 *
 */
public class Computer extends TangibleAsset {
    private String makerName;
	public Computer(String name, int price, String color) {
		super(name, price, color);
		this.makerName = makerName;
	}
    public String getName() {return this.makerName;}
}
