public abstract class aLista<E> implements iLista<E> {
    
	@Override
    public void push(E item) {
        this.addFirst(item);
    }

    @Override
    public E pop() {
        return this.removeFirst();
    }

    @Override
    public E peek() {
        return this.getFirst();
    }

    @Override
    public boolean empty() {
        if(this.size()>0){
            return false;
        }else{
            return true;
        }
    }

    public abstract int size();
}
