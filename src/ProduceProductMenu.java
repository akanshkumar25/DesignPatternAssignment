/**
 * SER-515 ProduceProductMenu responsible for bridge patterna and factory pattern
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

	public void selectMenu(int usertype) {
		System.out.println("ProductProduceMenu selected...\n Bridge Pattern for connection used");
		Person person;
		if (usertype == 0) {
			person = PersonFactory.createObject("Buyer");

		} else
		{
			person = PersonFactory.createObject("Seller");

		}
		person.ShowMenu();
	}

}
