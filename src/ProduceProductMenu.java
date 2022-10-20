/**
 * SER-515 ProduceProductMenu responsible for bridge patterns and factory pattern
 * 

 */
public class ProduceProductMenu extends ProductMenu {


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
		System.out.println("use productinfo.txt here");

	}

}
