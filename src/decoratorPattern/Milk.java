package decoratorPattern;

public class Milk extends CondimentDecorator {
    
	Beverage _beverage;
	
	public Milk () {
		
	}
	
	public Milk (Beverage beverage) {
		_beverage = beverage;
	}
	
	@Override
	public double cost() {
		return _beverage.cost() + 2.8;
	}
	
	public String getDescription () {
		return _beverage.getDescription() + " Milk";
	}

}
