import java.util.Scanner;

/**
 * SER-515 Facade class to take care of the facade pattern it calls the classes
 * for bridge pattern, factory pattern, visitor pattern, iterator pattern
 *
 */

public class Facade {
	int userType;
	String theSelectProduct;
	int nProductCategory;
	int theProductList;
	int thePerson;

	public void startFacade() {
		System.out.println("Facade pattern started \n");
		userType = login(new Login());
		System.out.println(
				"Select from available Course Menus \n 1. MeatProduct Menu \n 2. ProduceProduct Menu ");
		Scanner scan = new Scanner(System.in);
		theSelectProduct = scan.nextLine();
		// pattern implemented (Bridge implementation and Factory implementation
		if (theSelectProduct.equalsIgnoreCase("ProduceProduct Menu")) {
			SelectProduct(new ProduceProductMenu(), userType);
		} else if (theSelectProduct.equalsIgnoreCase("MeatProduct Menu")) {
			SelectProduct(new MeatProductMenu(), userType);
		} else {
			System.out.println("Wrong Selection");
			System.exit(-1);
		}

	}

	public int login(Login object) {
		return object.login();
	}

	public void addTrading() {
	}

	public void viewTrading( ) {
	}

	public void decideBidding ( ) {
	}

	public void discussBidding() {

	}

	public void submitBidding( ) {
	}

	public void remind() {
	}

	public void createUser(UserInfoItem userinfoitem) {
	}

	public void createProductList() {

	}

	public void AttachProductToUser(ProductMenu pm) {
	}

	public void SelectProduct(ProductMenu pm, int userType) {
		pm.selectMenu(userType);
	}

	public void productOperation() {

	}

}
