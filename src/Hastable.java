import java.util.Vector;

public class Hastable<K,V> implements Map<K,V> {

protected static final String RESERVED = "RESERVED";
protected Vector<HashAssociation<K,V>> data;
protected int count;
protected final double maximumLoadFactor = 0.6;

public void Hashtable(int initialCapacity)
// pre: initialCapacity > 0
// post: constructs a new Hashtable
// holding initialCapacity elements
{
   //Assert.pre(initialCapacity > 0, "Hashtable capacity must be positive.");
   data = new Vector<HashAssociation<K,V>>();
   data.setSize(initialCapacity);
   count = 0;
}

protected int locate(K key)
{
	// compute an initial hash code
   int hash = Math.abs(key.hashCode() % data.size());
	// keep track of first unused slot, in case we need it
   int reservedSlot = -1;
   boolean foundReserved = false;

   while (data.get(hash) != null)
   {
        if (data.get(hash).reserved()) {
           // remember reserved slot if we fail to locate value
           if (!foundReserved) {
               reservedSlot = hash;
               foundReserved = true;
           }
           } else {
             // value located? return the index in table
             if (key.equals(data.get(hash).getKey())) return hash;
           }
         // linear probing; other methods would change this line:
         hash = (1+hash)%data.size();
    }
   // return first empty slot we encountered
   if (!foundReserved) return hash;
   else return reservedSlot;
}


public V put(K key, V value)
	// pre: key is non-null object
	// post: key-value pair is added to hash table
	{
	if (maximumLoadFactor*data.size() <= (1+count)) {
		extend();
	}
	
	int hash = locate(key);
	if (data.get(hash) == null || data.get(hash).reserved())
	{ // logically empty slot; just add association
		data.set(hash,new HashAssociation<K,V>(key,value));
		count++;
		return null;
	} else {
	// full slot; add new and return old value
	HashAssociation<K,V> a = data.get(hash);
	V oldValue = a.getValue();
	a.setValue(value);
	return oldValue;
	}
}

private void extend() {
	// TODO Auto-generated method stub
	
}

@Override
public int size() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public boolean isEmpty() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean containsKey(K k) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean containsValue(V v) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public V get(K k) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public V remove(K k) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void putAll(Map<K, V> other) {
	// TODO Auto-generated method stub
	
}

@Override
public void clear() {
	// TODO Auto-generated method stub
	
}

@Override
public Set<K> keySet() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Structure<V> values() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Set<Association<K, V>> entrySet() {
	// TODO Auto-generated method stub
	return null;
}
}