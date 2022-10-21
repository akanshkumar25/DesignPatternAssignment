import java.util.Iterator;

/**
 * SER-515 Course Iterator to implement iterator pattern
 * 

 */

public class ProductIterator extends ListIterator {
	@SuppressWarnings("rawtypes")
	public boolean HasNext(Iterator iterator) {
		return iterator.hasNext();
	}

	@SuppressWarnings("rawtypes")
	public void MoveToHead(Iterator iterator) {
		System.out.println("Head Moved..");
	}

	@SuppressWarnings("rawtypes")
	public Product Next(Iterator iterator) {
		if (this.HasNext(iterator)) {
			return (Product) iterator.next();
		} else {
			return null;
		}
	}

	@SuppressWarnings("rawtypes")
	public void Remove(Iterator iterator) {
		if (this.HasNext(iterator)) {
			iterator.next();
		}

	}

}
