package decoratorPattern;

public class Chocolate extends CondimentDecorator {
	
	Beverage _beverage;
	
	public Chocolate () {
		
	}
	
	public Chocolate (Beverage beverage) {
		_beverage = beverage;
	}

	@Override
	public double cost() {
		return _beverage.cost() + 0.8;
	}
	
	public String getDescription () {
		return _beverage.getDescription() + " Chocolate";
	}

}
