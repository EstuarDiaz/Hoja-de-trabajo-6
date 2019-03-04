public interface iLista<E> extends iPila<E>{
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

}
