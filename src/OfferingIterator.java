import java.util.Iterator;

/**
 * SER-515 SolutionIterator class for Visitor Pattern
 * 

 */
public class OfferingIterator extends ListIterator {
	@SuppressWarnings("rawtypes")
	@Override
	public boolean HasNext(Iterator iterator) {
		return iterator.hasNext();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void MoveToHead(Iterator iterator) {
		System.out.println("Head Moved ");
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Offering Next(Iterator iterator) {
		if (this.HasNext(iterator)) {
			return (Offering) iterator.next();
		} else {
			return null;
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void Remove(Iterator iterator) {
		if (this.HasNext(iterator)) {
			iterator.next();
		}

	}

}
