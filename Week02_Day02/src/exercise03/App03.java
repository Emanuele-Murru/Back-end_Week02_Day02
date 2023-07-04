package exercise03;

import java.util.HashMap;
import java.util.Map;

public class App03 {
	
	private HashMap<String, String> Contatti = new HashMap<String, String>();

	public static void main(String[] args) {
		
		
		
	}

	//Metodi:
	
	//Metodo per inserire un nuovo contatto
	public void aggiungiContatto(String nome, String numero) {
		Contatti.put(nome, numero);
	}
	
	//Metodo per eliminare un contatto
		public void eliminaContatto(String nome, String numero) {
			Contatti.remove(nome, numero);
		}
	
	//Metodo per trovare un contatto tramite il numero di telefono
	
		public String findByNumber(String numero) {
			
			for (Map.Entry<String, String> e : Contatti.entrySet()) {
				
				if(e.getValue().equals(numero)) {
					return e.getKey();
				}
			}
			
			return null;
		}
		
		
	//Metodo per trovare il numero tramite il nome
		public String findByName(String nome) {
			return Contatti.get(nome);
		}
	
	//Metodo che stampa in console tutti i contatti
		public void stampaContatti() {
			System.out.println("Questa è lista dei contatti: " + Contatti);
		}
}
