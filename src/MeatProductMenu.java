/**
 * SER-515 MeatProductMenu responsible for bridge pattern and factory pattern
 * 

 */
public class MeatProductMenu extends ProductMenu {

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

	public void selectMenu(int USerType) {
		System.out.println("Meat Product Menu ...\n Bridge Pattern for connection used ");
		Person person;
		if (USerType == 0) {
			person = PersonFactory.createObject("Buyer");

		} else
		{
			person = PersonFactory.createObject("Seller");

		}
		person.ShowMenu();
	}
}
