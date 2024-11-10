package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Collection {
	final static int nbrElements = 1000000;
	static List array = new ArrayList<>(nbrElements);
	static List Linked = new LinkedList<>();
	
	public static void main(String args[]) {
		Random random = new Random();
		
		for(int  i = 0; i < nbrElements; i++) {
			int a = random.nextInt(500);
			array.add(a);
			Linked.add(a);
		}
		Iterator iTarray = array.iterator();
		Iterator iTlinked = Linked.iterator();
		
		// Test de suppression
		
		long debut, fin;
		
		debut = System.currentTimeMillis();
		Integer ar;
		
		while(iTarray.hasNext()) {
			ar = (Integer) iTarray.next();
			
			if(ar % 100 == 0)
				iTarray.remove();
		}
		
		fin = System.currentTimeMillis();
		System.out.println("Le temps d'execution pour la suppression dans le Array List est : " + String.valueOf(fin - debut));
		
		debut = System.currentTimeMillis();
		Integer lk;
		
		while(iTlinked.hasNext()) {
			lk = (Integer) iTlinked.next();
			
			if(lk % 100 == 0)
				iTlinked.remove();
		}
		fin = System.currentTimeMillis();
		System.out.println("Le temps d'execution pour la suppression dans le LinkedList est : " + String.valueOf(fin - debut));
	}
}