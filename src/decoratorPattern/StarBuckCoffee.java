package decoratorPattern;

public class StarBuckCoffee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage bvg = new DarkRoast ();
		
		bvg = new Milk(bvg);
		bvg = new Milk (bvg);
		bvg = new Chocolate(bvg);
		
		System.out.println("THe orded drink is " + bvg.getDescription() 
				+ " ; the charge is " + bvg.cost());
	}

}
