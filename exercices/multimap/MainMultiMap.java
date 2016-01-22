package exercices.multimap;

import java.util.Random;

public class MainMultiMap {

	public static void main(String[] args) {
		MultiMap<Integer, Integer> multiMap = MultiMaps.createMultiMap();
		
		Random rand = new Random();
		
		for(int i = 0 ; i < 30 ; i++){
			multiMap.put(rand.nextInt(10), rand.nextInt(1000));
		}
		
		System.out.println(multiMap);
	}

}
