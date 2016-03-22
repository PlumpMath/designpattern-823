/**
 *  Author: Derek.
 *  Email: derekyang2011@gmail.com
 */
package decoratorPattern;

/**
 * @author Derek
 *
 */
public class DarkRoast extends Beverage {
	public DarkRoast () {
		description = "DarkRoast";
	}
	
	public double cost() {
		return 1.5;
	}
}
