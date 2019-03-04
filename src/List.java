import java.util.Iterator;

public interface List<E> extends iPila<E>{
	/**
	* Obtener el primer elemento sin borrarlo
	* @return item E - Pimer elemento en la pila
	*/
    public E getFirst();
    
    /**
	* Agregar un elemento a la pila
	* @param item E - Elemento a agregar
	*/
    public void addFirst(E value);
    
    /**
	* Obtener el primer elemento y borrarlo
	* @return item E - Pimer elemento en la pila
	*/
    public E removeFirst();

	public boolean contains(E value);

	public E remove(E temp);

	public void add(E temp);

	public void clear();

	public Iterator<E> iterator();

	public E get(int i);

	public int indexOf(E association);
	
}
