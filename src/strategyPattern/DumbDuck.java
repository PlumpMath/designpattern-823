package strategyPattern;

public class DumbDuck extends Duck {
	public DumbDuck() {
		quackBehavior = new QuackAsAways();
		flyBehavior = new FlyWithoutWings();
	}
	
	public void performSwim() {
		System.out.println("I can swim pefectly");
	}
}
