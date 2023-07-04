package exercise01;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class App1 {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
        
        System.out.print("Inserisci il numero di parole da inserire: ");
        int n = input.nextInt();

        Set<String> parole = new HashSet<>();
        Set<String>paroleDuplicate = new HashSet<>();
        Set<String>paroleDistinte = new HashSet<>();
        
        System.out.print("Inserisci una parola: ");
        
        for (int i = 0; i < n; i++) {
            String parola = input.next();
            
            if(!parole.add(parola)) {
            	paroleDuplicate.add(parola);
            }
            
            paroleDistinte.add(parola);
        }
        
        System.out.println("------------- Parole duplicate -------");
        
        //Parole duplicate
        System.out.println("Parole duplicate: " + paroleDuplicate);
        
        
        System.out.println("------------- Numeor di parole distinte --------");
        
        //Parole distinte
        int numParoleDistinte = paroleDistinte.size();
        System.out.println("Numero di parole distinte: " + numParoleDistinte);
        
        System.out.println("--------- Elenco parole distinte -------");
        
        //Elenco parole distinte
        System.out.println("Elenco delle parole distinte: ");
        for (String parola : paroleDistinte) {
			System.out.println("- " + parola);
		}
		
        input.close();
	}

}
