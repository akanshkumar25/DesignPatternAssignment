import java.util.List;

/**
 * SER-515 ProduceProductMenu responsible for bridge patterns and factory pattern
 * 

 */
public class ProduceProductMenu extends ProductMenu {

	List<Product> produceProductList;

	public ProduceProductMenu(List<Product> theProductList) {
		produceProductList = theProductList;
		produceProductList.removeIf(product -> product.productCategory.equals("Meat"));

	}

	@Override
	public void ShowAddButtons() {
		System.out.println();

	}

	@Override
	public void ShowViewButtons() {

		System.out.println();
	}

	@Override
	public void ShowRadios() {

		System.out.println();
	}

	@Override
	public void showComboxes() {

		System.out.println();
	}

	@Override
	public void ShowLabels() {

		System.out.println();
	}

	public void showMenu() {
		System.out.println("ProductProduceMenu selected...\n Bridge Pattern for connection used");
		produceProductList.forEach(n -> System.out.println(n.productName));



	}

}
