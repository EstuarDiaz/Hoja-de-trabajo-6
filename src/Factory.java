import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Factory<K,V> {
	//selecciona la implementacion a utilizar para map
	//se utiliza el patron Factory
   public Map<K,V> getMap(String entry) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("HASH"))
      return new HashMap<K,V>(); //regresa HashMap
	else if (entry.equals("TREE"))
      return new TreeMap<K,V>(); //regresa TreeMap
	else if (entry.equals("LINKED"))
	      return new LinkedHashMap<K,V>(); // regresa LinkedHashMap
	else 
		return new HashMap<K,V>(); //default: regresa HashMap
   }
}
