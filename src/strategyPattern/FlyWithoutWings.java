package strategyPattern;

public class FlyWithoutWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I am flying without wings!");
	}

}
