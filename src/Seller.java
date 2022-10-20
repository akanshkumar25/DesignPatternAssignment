/**
 * SER-515 Seller class to inherit person class
 * 

 */
public class Seller extends Person {
	Seller() {
		super(theProductMenu);
	}

	Seller(ProductMenu theProductMenu) {
		super(theProductMenu);
	}

	@Override
	public void ShowMenu() {
		System.out.println("Seller Menu items....");

	}

	@Override
	public ProductMenu CreateProductMenu() {
		String test = "ProduceProductMenu";
		if (test.equalsIgnoreCase("ProduceProductMenu")) {
			return new ProduceProductMenu();
		} else {
			return new MeatProductMenu();
		}
	}

}
