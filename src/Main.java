import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("Selecciones el tipo de implementacion a trabajar:");
		System.out.println("1. HashMap");
		System.out.println("2. TreeMap");
		System.out.println("3. LinkedHashMap");
		Scanner input = new Scanner(System.in);
		Factory<String, String> myFactory = new Factory<String,String>();
		Map<String, String> lista;
		String respuesta = input.nextLine();
		if(respuesta == "1"){
			lista = myFactory.getMap("HASH");
		}
		else if(respuesta == "3") {
			lista = myFactory.getMap("LINKED");
		}
		else if(respuesta == "2") {
			lista = myFactory.getMap("TREE");
		}
		else {
			lista = myFactory.getMap(respuesta);
		}
		input.close();
		System.out.println("Leyendo archivo ...");
		try{
			//obtiene el archivo
	        FileReader 	fr = new FileReader("cards_desc.txt");
	        BufferedReader br = new BufferedReader (fr);
	        String r = br.readLine();
	        while(r != null) {
	        	String[] texto = r.split("|");
	        	//lista.put(texto[0], texto[1]);
	        	r = br.readLine();
	        }
	        br.close();
	        System.out.println("Se leyo el archivo correctamente.");
		}catch(Exception e){
			System.out.println("Hubo un error en su texto:");
			System.out.println(e.toString());
		}
	}
}
