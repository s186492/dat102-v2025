package hvl.dat102;
import java.util.*;


public class SokingavHashsetOgBinærsok {

	public static void main(String[] args) {
		int antallElementer = 100000;
		int sokteElementer = 10000;
		int maksVerdi = 100000;
		int uniktTall = 45713;
		
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		int[]array = new int[antallElementer];
		
		
		
		int tall = 376; 
		for (int i = 0; i < antallElementer; i++){
			hashset.add(tall);
			array[i] = tall;
			
			tall = (tall + uniktTall) % maksVerdi; 
		}
		
		Arrays.sort(array);
		
		int[] TilfeldigeTall = new int[sokteElementer]; 
		for(int i = 0; i < sokteElementer; i++) {
			TilfeldigeTall[i] = (int)Math.random() * 10000;
		}
		
		
		long startTid = 
		
		System.out.print(array[32]);
	}

}
