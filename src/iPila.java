import java.util.Iterator;

public interface iPila<E> 
{
   /**
	* Agregar un elemento en la pila
	* @param item E - Elemento que se agrega en la pila
	*/
   public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
   /**
    * Obtener el ultimo elemento de la pila y borrarlo de la pila
    * @return - El ultimo elemento de la pila
    */
   public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   /**
    * Obtener el ultimo elemento de la pila sin sacarlo
    * @return - El ultimo elemento de la pila
    */
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   /**
    * Devuelve el estado de la pila, si esta vacia o no
    * @return Boolean - True si y solo si el stack esta vacio
    */
   public boolean empty();
   // post: returns true if and only if the stack is empty
   
   /**
    * Devuelve el tamanio de la pila
    * @return int - El numero de elementos de la pila
    */
   public int size();
   // post: returns the number of elements in the stack

boolean contains(E value);

E remove(E temp);

void add(E temp);

void clear();

Iterator<E> iterator();

E get(int i);

int indexOf(E association);

}