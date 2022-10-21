import java.util.ArrayList;
import java.util.Iterator;

/**
 * SER-515 SolutionList to store list of solutions implementing the iterator pattern
 * 

 */
public class OfferingList {

	ArrayList<Offering> offeringList = new ArrayList<>();

	OfferingList() {
		offeringList.add(new Offering("Pork"));
		offeringList.add(new Offering("Beef"));
	}

	@SuppressWarnings("rawtypes")
	public Iterator createIterator() {
		return this.offeringList.iterator();
	}
}
