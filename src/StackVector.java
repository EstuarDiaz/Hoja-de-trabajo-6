import java.util.Iterator;
import java.util.Vector;

public class StackVector<E>
 extends aPila<E>
{
	protected Vector<E> data;

	public StackVector()
	// post: constructs a new, empty stack
	{
		data = new Vector<E>();
	}

	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove(E temp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(E temp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E association) {
		// TODO Auto-generated method stub
		return 0;
	}
  
	
}