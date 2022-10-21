import java.util.Iterator;

/**
 * SER-515 List iterator class for implementing iterator pattern
 * 

 */


public abstract class ListIterator {
	@SuppressWarnings("rawtypes")
	public abstract boolean HasNext(Iterator iterator);

	@SuppressWarnings("rawtypes")
	public abstract void MoveToHead(Iterator iterator);

	@SuppressWarnings("rawtypes")
	public abstract Object Next(Iterator iterator);
	
	@SuppressWarnings("rawtypes")
	public abstract void Remove(Iterator iterator);

}
