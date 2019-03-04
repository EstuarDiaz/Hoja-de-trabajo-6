import java.util.Iterator;

/*
    Codigo extraido y adaptado de Java Structures, (Bailey, 2007)

*/

public class SimpleList<E> extends aLista<E> {
    protected int count;
    protected Node<E> head;

    @Override
    public int size() {
        return this.count;
    }
    
    @Override
    public E getFirst()
    // pre: list is not empty
    // post: returns first value in list
    {
        return head.value();
    }

    @Override
    public void addFirst(E value) {
        // note order that things happen:
        // head is parameter, then assigned
        head = new Node<E>(value, head);
        count++;
    }

    @Override
    public E removeFirst()
    // pre: list is not empty
    // post: removes and returns value from beginning of list
    {
        Node<E> temp = head;
        head = head.next(); // move head down list
        count--;
        return temp.value();
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
