import java.util.Map;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("Selecciones el tipo de implementacion a trabajar:");
		System.out.println("1. HashMap");
		System.out.println("2. TreeMap");
		System.out.println("3. LinkedHashMap");
		Scanner input = new Scanner(System.in);
		Factory<String, String> myFactory = new Factory<String,String>();
		Map<String, String> disponibles;
		Map<String, String> miLista;
		Map<String, String> miListaCount;
		String respuesta = input.nextLine();
		if(respuesta.equals("1")){
			System.out.println("HashMap seleccionado");
			disponibles = myFactory.getMap("HASH");
			miLista = myFactory.getMap("HASH");
			miListaCount = myFactory.getMap("HASH");
		}
		else if(respuesta.equals("2")) {
			System.out.println("TreeMap seleccionado");
			disponibles = myFactory.getMap("TREE");
			miLista = myFactory.getMap("TREE");
			miListaCount = myFactory.getMap("TREE");
		}
		else if(respuesta.equals("3")) {
			System.out.println("inkedMap seleccionado");
			disponibles = myFactory.getMap("LINKED");
			miLista = myFactory.getMap("LINKED");
			miListaCount = myFactory.getMap("LINKED");
		}
		else {
			System.out.println("Map default seleccionado");
			disponibles = myFactory.getMap(respuesta);
			miLista = myFactory.getMap(respuesta);
			miListaCount = myFactory.getMap(respuesta);
		}
		System.out.println("Leyendo archivo ...");
		try{
			//obtiene el archivo y guarda las cartas disponibles
	        FileReader 	fr = new FileReader("cards_desc.txt");
	        BufferedReader br = new BufferedReader (fr);
	        String r = br.readLine();
	        while(r != null) {
	        	String[] texto = r.split(Pattern.quote("|"));
	        	disponibles.put(texto[0],texto[1]);
	        	r = br.readLine();
	        }
	        br.close();
	        System.out.println("Se leyo el archivo correctamente.");
	        respuesta = "";
	        while(!respuesta.equals("7")) {
	        	System.out.println("Selecciona una opcion:");
	        	System.out.println("1. Agregar carta.");
	        	System.out.println("2. Mostrar tipo de carta.");
	        	System.out.println("3. Listado de cartas del usuario.");
	        	System.out.println("4. Listado de cartas del usuario, odenadas por tipo.");
	        	System.out.println("5. Listado de cartas existentes");
	        	System.out.println("6. Listado de cartas existentes, ordenadas por tipo.");
	        	System.out.println("7. Salir");
	        	respuesta = input.nextLine();
	        	if(respuesta.equals("1")) {
	        		System.out.println("Ingresa el nombre de la carta a agregar.");
	        		String nombre = input.nextLine().toString();
	        		if(disponibles.containsKey(nombre)) {
	        			miLista.put(nombre, disponibles.get(nombre));
	        			System.out.println("Se agrego la carta a la lista.");
	        		}
	        		else {
	        			System.out.println("Carta no disponible.");
	        		}
	        	}
	        	else if(respuesta.equals("2")) {
	        		System.out.println("Ingresa el nombre de la carta a mostrar.");
	        		String nombre = input.nextLine().toString();
	        		if(miLista.containsKey(nombre)) {
	        			System.out.println("Tipo:"+miLista.get(nombre));
	        		}
	        		else {
	        			System.out.println("Carta no disponible.");
	        		}
	        	}
	        	else if(respuesta.equals("3")) {
	        		miListaCount.clear();
	        		miLista.forEach((k,v)-> {
	        			if(miListaCount.containsKey(k)) {
	        				System.out.println("A"+miListaCount.get(k));
	        				int count = Integer.parseInt(miListaCount.get(k))+1;
	        				miListaCount.put(k, Integer.toString(count));
	        				System.out.println(miListaCount.get(k));
	        			}
	        			else {
	        				miListaCount.put(k, "1");
	        			}
	        		});
	        		miListaCount.forEach((k,v)-> 
	        			System.out.println("Nombre:"+k+", Tipo:"+miLista.get(k)+", Cantidad:"+v)
	    			);
	        	}
	        	else if(respuesta.equals("4")) {
	        		miLista.forEach((k,v)-> 
	        			System.out.println("Nombre:"+k+", Tipo:"+v)
        			);
	        	}
	        	else if(respuesta.equals("5")) {
	        		disponibles.forEach((k,v)-> 
	        			System.out.println("Nombre:"+k+", Tipo:"+v)
        			);
	        	}
	        	else if(respuesta.equals("6")) {
	        		List<Entry<String,String>> listaOrdenada = new ArrayList<>(disponibles.entrySet());
	                listaOrdenada.sort(Entry.comparingByValue());
	                for (Entry<String, String> entry : listaOrdenada) {
	                	System.out.println("Tipo:"+entry.getValue()+", Nombre:"+entry.getKey());
	                }
	        	}
	        	else {
        			System.out.println("Selecciona una opcion valida.");
	        	}
	        }
		}catch(Exception e){
			System.out.println("Hubo un error en su texto:");
			System.out.println(e.toString());
		}
		finally {
			input.close();
		}
	}
}
