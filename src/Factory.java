
public class Factory<K,V> {
	//selecciona la implementacion a utilizar para map
	//se utiliza el patron Factory
   public Map<K,V> getMap(String entry) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("HASH"))
      return new Hastable<K,V>(); //regresa HashMap
	else if (entry.equals("TREE"))
      return new MapList<K,V>(); //regresa TreeMap
	else if (entry.equals("LINKED"))
	      return new MapList<K,V>(); // regresa LinkedHashMap
	else 
		return new Hastable<K,V>(); //default: regresa HashMap
   }
}
