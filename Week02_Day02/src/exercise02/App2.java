package exercise02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App2 {

	public static void main(String[] args) {

		int n = 10;
		boolean PariDispari = false;

		System.out.println("------------- Lista casuale -------");
		List<Integer> randomList = listaRandomica(n);
		System.out.println("Lista casuale: " + randomList);

		System.out.println("------------- Lista invertita -------");

		List<Integer> reversedList = reverseLista(randomList);
		System.out.println("Lista invertita: " + reversedList);

		System.out.println("--------------------------------");
		
		System.out.print("Lista di numeri in posizione ");
		if (PariDispari)
			System.out.println("pari:");
		else
			System.out.println("dispari:");

		posizioneValori(randomList, PariDispari);
	}

	
	public static List<Integer> listaRandomica(int n) {
		
		List<Integer> randomList = new ArrayList<>();
		
		Random random = new Random();
		
		for (int i = 0; i < n; i++) {
			int randomNumber = random.nextInt(101);
			randomList.add(randomNumber);
			
		}
		Collections.sort(randomList);
		return randomList;
	}

	public static List<Integer> reverseLista(List<Integer> list) {
		
		List<Integer> reversedList = new ArrayList<>(list);
		
		Collections.reverse(reversedList);
		
		list.addAll(reversedList);
		
		return list;
	}

	
	public static void posizioneValori(List<Integer> list, boolean PariDispari) {
		
		for (int i = 0; i < list.size(); i++) {
			if ((i % 2 == 0 && PariDispari) || (i % 2 != 0 && !PariDispari)) {
				System.out.println(list.get(i));
			}
		}
	}
}
