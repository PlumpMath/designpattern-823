package strategyPattern;

/***
 * @author Derek
 * 
 * Favor composition over inheritance
 * Has-A can be better than IS-A
 * 
 * 
 * The Strategy Pattern defines a family of algorithms, encapsulate
 * each one, and makes them interchangeable. Strategy lets the
 * algorithm vary independently from clients that use it
 *
 */
public final class TestDuck {
	public static void main(String[] args) {
		Duck testDuck = new DumbDuck();
		testDuck.performFly();
		testDuck.performQuack();
		testDuck.setFlyBehavior(new FlyNoWay());
		testDuck.performFly();
	}

}
