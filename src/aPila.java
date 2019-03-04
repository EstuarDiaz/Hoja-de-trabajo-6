abstract public class aPila<E> 
implements iPila<E>
{
	/**
    * Devuelve el estado de la pila, si esta vacia o no
    * @return Boolean - True si y solo si el stack esta vacio
    */
      public boolean isEmpty()
   // post: regresa true si el stack esta vacio
   {
      return size() == 0;
   }
}